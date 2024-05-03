package com.gildedrose;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.print.Printable;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import org.junit.jupiter.api.DisplayName;

class GildedRoseTest {
    
    
    		@DisplayName("Pruebas producto general")
            @ParameterizedTest(name = "Calidad: {0}, Venta: {1}")
            @CsvSource({
            	"2, 1", 
            	"4, 2",
            	"-1, 1",
            	"-2, 7"
            	})
            
    		void GeneralProduct(int sellIn, int quality) {
                Item[] items = new Item[]{new Item("foo", sellIn, quality)};
                GildedRose app = new GildedRose(items);
                app.updateQuality();
                assertEquals("foo", app.items[0].name);
                
                if (sellIn < 0 && app.items[0].quality > 0) {
                	assertEquals(quality -2, app.items[0].quality);
                } else {
                	assertEquals(quality -1, app.items[0].quality);
                }
                assertEquals(sellIn - 1, app.items[0].sellIn);
            }
    		
    		
    		@DisplayName("Pruebas producto Aged Brie")
            @ParameterizedTest(name = "Calidad: {0}, Venta: {1}")
            @CsvSource({
            	"2, 50", 
            	"4, 25",
            	"-2, 50",
            	"-6, 4"
            	})
            
    		void AgedBrie(int sellIn, int quality) {
                Item[] items = new Item[]{new Item("Aged Brie", sellIn, quality)};
                GildedRose app = new GildedRose(items);
                app.updateQuality();
                assertEquals("Aged Brie", app.items[0].name);
                
                if (app.items[0].quality < 50 && sellIn <= 0) {
                	assertEquals(quality +2, app.items[0].quality);
                } else if (app.items[0].quality < 50 && sellIn >= 0) {
                	assertEquals(quality +1, app.items[0].quality);
				} else {
                	assertEquals(quality, app.items[0].quality);
				}
                
                	assertEquals(sellIn -1 , app.items[0].sellIn);
  
            }

    
		    @DisplayName("Producto sulfuras")
			@Test
			void Prueba1() {
		        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -6, 4) };
		        GildedRose app = new GildedRose(items);
		        app.updateQuality();
		        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
		        assertEquals(4, app.items[0].quality);
		        assertEquals(-6, app.items[0].sellIn);
		    }
}