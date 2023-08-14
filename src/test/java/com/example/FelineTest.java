package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    Feline felineMock;

    @Test
    public void getNameFamily() {
        Feline feline = new Feline();
        System.out.println(feline.getFamily());
    }

    @Test
    public void shouldBeTwoNamesFamilyEquals() {
        Feline feline = new Feline();
        Assert.assertEquals("Неверное значение! Должно быть семейство кошачьих", "Кошачьи", feline.getFamily());
    }

    @Test
    public void checkArgumentsMock() {
        felineMock.getFamily();
        Mockito.verify(felineMock).getFamily();
    }

    @Test
    public void getListWhoEatMeat() throws Exception{
        Feline feline = new Feline();
        System.out.println(feline.eatMeat());
    }

    @Test
    public void shouldBeTwoListWhoEatMeatEquals() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals("Хищники относятся к семейству кошачьих", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void howManyTimesMethodCalledMock() throws Exception {
        felineMock.eatMeat();
        felineMock.eatMeat();
        felineMock.eatMeat();
        felineMock.eatMeat();
        felineMock.eatMeat();
        Mockito.verify(felineMock, Mockito.times(5)).eatMeat();
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        System.out.println(feline.getKittens());
    }

    @Test
    public void shouldBeTwoKittensMeaningNotEquals() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertNotEquals("Не должно возвращаться 1", 3, actual);
    }
}