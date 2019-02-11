package Sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {
	
	LinkedList<Mountain> mtn = new LinkedList<Mountain>();
	
	class NameCompare implements Comparator<Mountain> {

		@Override
		public int compare(Mountain o1, Mountain o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}
	
	class HeightCompare implements Comparator<Mountain> {

		@Override
		public int compare(Mountain m1, Mountain m2) {
			return (m2.getHeight() - m1.getHeight());
		}
	}
	
	public static void main(String[] args) {
		new SortMountains().go();
	}
	
	public void go() {
		mtn.add(new Mountain("Longs", 14255));
		mtn.add(new Mountain("Elbert", 14433));
		mtn.add(new Mountain("Maroon", 14156));
		mtn.add(new Mountain("Castle", 14265));
		
		mtn.forEach(mount -> System.out.println("As Enetered" +mount.getName()));
		
		NameCompare nc = new NameCompare();
		Collections.sort(mtn, nc);
		
		mtn.forEach(mount -> System.out.println("By Name"+  mount.getName()));
		
		HeightCompare hc = new HeightCompare();
		Collections.sort(mtn,hc);
		
		mtn.forEach(mount -> System.out.println("by Height\n" + mount.getName() +" Height"+mount.getHeight()));
		
	}
}
