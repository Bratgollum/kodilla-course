package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    private Invoice invoice;
    private Item item01;
    private Item item02;
    private Product product01;
    private Product product02;

    private static final Logger LOGGER = LoggerFactory.getLogger(InvoiceDaoTestSuite.class);

    @Before
    public void beforeTest(){
       product01 = new Product("Shirt01");
       product02 = new Product("Scarf01");
       item01 = new Item(product01,new BigDecimal(20), 3, new BigDecimal(300));
       item02 = new Item(product02, new BigDecimal(30),4,new BigDecimal(230));
    }
    @Test
    public void testInvoiceDaoSave(){
        //Given
        invoice = new Invoice();
        invoice.getItems().add(item01);
        invoice.getItems().add(item02);
        //When
        invoiceDao.save(invoice);
        //Then
        int id = invoice.getId();
        Optional<Invoice> readInvoice = invoiceDao.findById(id);
        Assert.assertTrue(readInvoice.isPresent());
        Assert.assertEquals(2,invoice.getItems().size());
        //Clean Up
        invoiceDao.deleteById(id);
    }
}
