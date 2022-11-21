package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=1800;
        int actual = cashbackHackService.remain(amount);
        int expected = 200;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldNotRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount=2000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

}