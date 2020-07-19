package com.epam.task1;
import com.epam.task1.chocolates.Chocolate;
import com.epam.task1.chocolates.Kitkat;
import com.epam.task1.chocolates.Reeses;
import com.epam.task1.chocolates.Snickers;
import com.epam.task1.Sweets.GulabJamun;
import com.epam.task1.Sweets.Jalebi;
import com.epam.task1.Sweets.Rasmalai;
import com.epam.task1.Sweets.Sweet;

public class Database {
	public static final Chocolate[] chocolates = {
            new Kitkat("Kitkat", 10.50f, 15.0f),
            new Reeses("Reeses", 50.75f, 13.06f),
            new Snickers("Snickers", 60.25f, 30.0f)
    };
    public static final Sweet[] sweets = {
            new GulabJamun("GulabJamun", 45.0f, 20.5f),
            new Jalebi("Jalebi", 20.0f, 30),
            new Rasmalai("Rasmalai", 10, 20)
    };
}
