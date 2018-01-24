/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import memory.GarbageCollector;

/**
 *
 * @author ialsmadi
 */
public class OSLab2 {
    
    public static void main(String[] args){
     //   Test1();
       //  Test2();
         // Test3();
           //Test4();
          //  Test5();
          //   Test6();
             Test7();
    }
    
    public static void Test1() {
		
		GarbageCollector gc = new GarbageCollector();
		
		String id = "testObject";
		
		gc.addHeapObject(id);
		
		System.out.println(gc.memUse());
		
		System.out.println(gc.isMarked(id));
		
		System.out.println(gc.isInHeapMemory(id));
		
		System.out.println(gc.isInStackMemory(id));
		
		System.out.println(gc.isInMemory(id));
		
		gc.mark();
		
		System.out.println(gc.isMarked(id));
		
		gc.sweep();
		
		System.out.println(gc.isInMemory(id));
		
		System.out.println(gc.memUse());
		
	}
    
    public static void Test6() {
		
		GarbageCollector gc = new GarbageCollector();
		
		String id = "testObject";
		String id2 = "testObject2";
		String id3 = "testObject3";

		
		gc.addHeapObject(id);
		gc.addHeapObject(id2);
		gc.addHeapObject(id3);
		
		gc.addStackObject(id);
		gc.addStackObject(id2);
		
		gc.addReference(id, id2);
		
		System.out.println(gc.memUse());
		
		System.out.println(gc.isInHeapMemory(id));
		
		System.out.println(gc.isInStackMemory(id));
		
		System.out.println(gc.isInMemory(id));
		
		gc.mark();
				
		gc.sweep();

		System.out.println(gc.memUse());	
		
		System.out.println(gc.isInHeapMemory(id3));
	}
	public static void Test7() {
		
		GarbageCollector gc = new GarbageCollector();
		
                for(int k=0; k<100; k++){
		String id = "testObject" + k;
		System.out.println("start for object..."+ k);
		gc.addHeapObject(id);
			
		gc.addStackObject(id);
                
		
		System.out.println(gc.memUse());
		
		System.out.println(gc.isInHeapMemory(id));
		
		System.out.println(gc.isInStackMemory(id));
		
		System.out.println(gc.isInMemory(id));
		
		gc.mark();
				
		gc.sweep();

		System.out.println(gc.memUse());	
		System.out.println("end for object..."+ k);
                }
	}
	
	public static void Test5() {
		
		GarbageCollector gc = new GarbageCollector();
		
		String id = "testObject";
		String id2 = "testObject2";
		String id3 = "testObject3";
		String id4 = "testObject4";
		String id5 = "testObject4";

		gc.addHeapObject(id2);
		gc.addHeapObject(id3);
		gc.addHeapObject(id4);
		gc.addHeapObject(id5);
		
		gc.addStackObject(id);
		
		gc.addReference(id, id2);
		gc.addReference(id, id3);
		gc.addReference(id, id4);
		
		gc.mark();
				
		gc.sweep();

		System.out.println(gc.memUse());		
	}

	
	public static void Test4() {
		
		GarbageCollector gc = new GarbageCollector();
		
		String id = "testObject";
		String id2 = "testObject2";
		String id3 = "testObject3";
		String id4 = "testObject4";
		String id5 = "testObject4";

		gc.addHeapObject(id2);
		gc.addHeapObject(id3);
		gc.addHeapObject(id4);
		gc.addHeapObject(id5);
		
		gc.addStackObject(id);
		
		gc.addReference(id, id2);
		gc.addReference(id2, id3);
		gc.addReference(id2, id4);
		
		gc.mark();
				
		gc.sweep();

		System.out.println(gc.memUse());		
	}
	
	
	public static void Test3() {
		
		GarbageCollector gc = new GarbageCollector();
		
		String id = "testObject";
		String id2 = "testObject2";
		String id3 = "testObject3";
		String id4 = "testObject4";
		String id5 = "testObject4";

		gc.addHeapObject(id2);
		gc.addHeapObject(id3);
		gc.addHeapObject(id4);
		gc.addHeapObject(id5);
		
		gc.addStackObject(id);
		gc.addStackObject(id2);
		gc.addStackObject(id3);
		gc.addStackObject(id4);
		
		gc.addReference(id, id2);
		gc.addReference(id2, id3);
		gc.addReference(id2, id4);
		
		gc.mark();
				
		gc.sweep();
		
		System.out.println(gc.memUse());		

		gc.removeReference(id2, id4);
		gc.removeReference(id2, id4);
		gc.removeReference(id2, id4);

		gc.mark();
		
		gc.sweep();
		
		System.out.println(gc.memUse());		
	}
	
	
	public static void Test2() {
		
		GarbageCollector gc = new GarbageCollector();
		
		String id = "testObject";
		String id2 = "testObject2";
		String id3 = "testObject3";
		
		gc.addHeapObject(id);
		gc.addHeapObject(id3);
		gc.addStackObject(id2);
		
		gc.addReference(id2, id);
		gc.mark();
		gc.sweep();
		
		System.out.println(gc.memUse());
		
		gc.removeReference(id2, id);
		gc.mark();
		gc.sweep();
		
		System.out.println (gc.memUse());
	}
}
