package test.java;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {
	
	SortDemoData data = new SortDemoData();
	
	/**
	 * This test is to cover the first sequence :
	 * 20 22 24 25 26 27 28 29 30 31 32 33 34 28 35 27 36 → 
	 * Node Coverage, Edge Coverage
	 */
	@Test
	public void testBubbleSort() {
		data.initializeArray("5 64 4");
		SortAlgos.bubbleSort(data.myArray);
		assertTrue(data.myArray[0].key == 4);
		assertTrue(data.myArray[1].key == 5);
		assertTrue(data.myArray[2].key == 64);
	}
	
	/**
	 * This is a test to cover the 2nd sequence :
	 * 20 22 24 25 26 27 28 29 34 28 35 27 36 → 
	 * Edge Coverage, Condition Coverage
	 */
	@Test
	public void testBubbleSortIfCondition() {
		data.initializeArray("4 5 6 7");
		SortAlgos.bubbleSort(data.myArray);
		assertTrue(data.myArray[0].key == 4);
		assertTrue(data.myArray[1].key == 5);
		assertTrue(data.myArray[2].key == 6);
		assertTrue(data.myArray[3].key == 7);
	}
	
	/**
	 * This test is to cover the 4th sequence :
	 * 20 22 24 25 26 27 36 → Edge Coverage, Condition Coverage
	 */
	@Test
	public void testBubbleSortWhen1Element() {
		data.initializeArray("1");
		SortAlgos.bubbleSort(data.myArray);
		assertTrue(data.myArray[0].key == 1);
	}
	

	/**
	 * This is a test to cover the 5th sequence :
	 * 20 22 38 → Condition Coverage
	 */
	@Test (expected=java.lang.NullPointerException.class)
	public void testBubbleSortInputNull() {
		SortAlgos.bubbleSort(null);
		
	}
	
	@Test
	public void testSelectionSort() {
		data.initializeArray("5 64 4");
		SortAlgos.selectionSort(data.myArray);
		assertTrue(data.myArray[0].key == 4);
		assertTrue(data.myArray[1].key == 5);
		assertTrue(data.myArray[2].key == 64);
	}
	
	@Test (expected=java.lang.NullPointerException.class)
	public void testSelectionSortWithNullInput() {
		SortAlgos.selectionSort(data.myArray);
	}
	
	@Test
	public void testInsertionSort() {
		data.initializeArray("5 64 4");
		SortAlgos.insertionSort(data.myArray);
		assertTrue(data.myArray[0].key == 4);
		assertTrue(data.myArray[1].key == 5);
		assertTrue(data.myArray[2].key == 64);
	}
	
	@Test (expected=java.lang.NullPointerException.class)
	public void testInsertionSortWithNullInput() {
		SortAlgos.insertionSort(data.myArray);
	}
	
	@Test
	public void testMergeSort() {
		data.initializeArray("5 64 4");
		SortAlgos.mergeSort(data.myArray);
		assertTrue(data.myArray[0].key == 4);
		assertTrue(data.myArray[1].key == 5);
		assertTrue(data.myArray[2].key == 64);
	}
	
	@Test (expected=java.lang.NullPointerException.class)
	public void testMergeSortWithNullInput() {
		SortAlgos.mergeSort(data.myArray);
	}
	
	@Test
	public void testHeapSort() {
		data.initializeArray("5 64 4");
		SortAlgos.heapSort(data.myArray);
		assertTrue(data.myArray[0].key == 4);
		assertTrue(data.myArray[1].key == 5);
		assertTrue(data.myArray[2].key == 64);
	}
	
	@Test (expected=java.lang.NullPointerException.class)
	public void testHeapSortInputNull() {
		SortAlgos.heapSort(null);
		
	}
	
	@Test
	public void testQuickSort() {
		data.initializeArray("5 64 4");
		SortAlgos.quickSort(data.myArray);
		assertTrue(data.myArray[0].key == 4);
		assertTrue(data.myArray[1].key == 5);
		assertTrue(data.myArray[2].key == 64);
		
	}
	
	@Test
	public void testQuickSortWhenTwoItems() {
		data.initializeArray("68 64");
		SortAlgos.quickSort(data.myArray);
		assertTrue(data.myArray[0].key == 64);
		assertTrue(data.myArray[1].key == 68);
		
	}
	
	@Test
	public void testQuickSortVariant() {
		data.initializeArray("68 64 61 60 50 40");
		SortAlgos.quickSort(data.myArray);
		assertTrue(data.myArray[0].key == 40);
		assertTrue(data.myArray[1].key == 50);
		assertTrue(data.myArray[2].key == 60);
		assertTrue(data.myArray[3].key == 61);
		assertTrue(data.myArray[4].key == 64);
		assertTrue(data.myArray[5].key == 68);
		
		
	}
	
	@Test (expected=java.lang.NullPointerException.class)
	public void testQuickSortInputNull() {
		SortAlgos.quickSort(null);
		
	}
	
}
