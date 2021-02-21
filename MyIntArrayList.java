import java.util.Arrays;
	
public class MyIntArrayList {
		 
	private int[] elements;
	private int size;
		 
	public MyIntArrayList() {
		this(10);
	}
		 
	public MyIntArrayList(MyIntArrayList c) {		
		this.size = c.size;
		this.elements = new int[this.size];
		
		for (int i = 0; i < this.size; i++)
			elements[i] = c.get(i);			 
	}
			 
	public MyIntArrayList(int initialCapacity) {		
		this.elements = new int[initialCapacity];
				
	}
		 
				 
	public void add(int index, int element) {		
		if (index < 0 || index >= this.size) {
		      System.out.println("Throwing IndexOutOfBoundsException when trying to" +
		                         " remove element at position " + index);
		    }
			
			if (this.size == this.elements.length) {
				this.elements = Arrays.copyOf(this.elements, this.size * 2);			
			}
			
			this.size++;
		 
		    for (int i = index; i <= this.size - 1; i++) {
		      this.elements[i] = this.elements[i+1];
		    }
		    
		    this.elements[index - 1] = element;
		
			 
		}
			  
	public boolean add(int e) {
		
		if (this.size == this.elements.length) {
			this.elements = Arrays.copyOf(this.elements, this.size * 2);
			    }
			 
			 this.elements[size] = e;
			 this.size++;
			 
			    return true;
			
				  }
				 
	public int size() {
		
		 return this.size;
				   
	}
		 
	public boolean contains(int e) {
		 
		for (int i = 0; i < this.size; i++) {
		      if (this.elements[i] == e) 
		        return true;
		  } 
		
		return false;
			 
		 }
		 
	public int get(int index) {									
		if (index < 0 || index > this.size) {
			System.out.println("IndexOutOfBounds!");
			return 0;
			
		}
		
		return this.elements[index];
	}
				 
	public int indexOf(int e) {
		
		for (int i = 0; i < this.size; i++) {
		      if (this.elements[i] == e) {
		        return i;
		      }
		    }	 return -1;		
				    
	}
	
	public int lastIndexOf(int e) {
		int lastIndex = 0;
		
		if (this.contains(e)) {
		for (int i = 0; i < this.size; i++) {
		      if (this.elements[i] == e) {
		        lastIndex = i;
		      }
		 }
		    
			return lastIndex;
		    
		} return -1;		
		
	}
		  
	public boolean remove(int e) {		
		if (this.contains(e)) {		  
			for (int i = this.indexOf(e); i < this.size - 1; i++) {
		      	this.elements[i] = this.elements[i+1]; 
		      }		  
		  
			this.size--;
		  return true;
		  
		}	return false;		 
			  
	}
				 
	public int removeElementAtIndex(int index) {
		
		 if (index < 0 || index >= this.size) {
		      // should throw IndexOutOfBoundsException
	      System.out.println("Throwing IndexOutOfBoundsException when trying to" +
	                         " remove element at position " + index);
	      return -1;
	    }
	 
	    int removedElement = this.elements[index];
	    for (int i = index; i < this.size - 1; i++) {
	      this.elements[i] = this.elements[i+1];
	    }
	    this.size--;
	 
	    return removedElement;
				   
			  }
			 
	public void clear() {
		
		this.size = 0;
			    
			  }
			 
	public int set(int index, int e) {
		
		if (index < 0 || index >= this.size) {
		      // should throw IndexOutOfBoundsException
		      System.out.println("Throwing IndexOutOfBoundsException when trying to set" +
		                         " the element " + e + " at position " + index);
		      return -1;
		    }
		 
		    int replacedElement = this.elements[index];
		    this.elements[index] = e;
		    return replacedElement;
			    
	}
			  
	public boolean addAll(MyIntArrayList c) {
		
		int initSize = this.size;
		
		if (c.size == 0 || c == null) {
			System.out.println("NullPointerException");
			
			return false;
		}
		
		if (c.size() + this.size > this.elements.length)
			this.elements = Arrays.copyOf(this.elements, this.size + c.size);
		
		this.size += c.size;
		
	    for (int i = initSize; i < this.size; i++) {
	    	this.elements[i] = c.elements[i - initSize];
	    }
	    
	   
		
			
			return true;				  
	
	}
			  
	public boolean addAll(int index, MyIntArrayList c) {		
		if (c.size == 0 || c == null) {
			System.out.println("NullPointerException");			
			return false;
		}
		
		
		
		if (this.size + c.size > this.elements.length) {			
			this.elements = Arrays.copyOf(this.elements, this.size * 2);			
		}
		
		index = this.size;
		
		for (int i = 0; i < c.size; i++) {
			this.elements[index] = c.elements[i];
			index++;
		}
		
		this.size += c.size;
					
				return true;
				  
	}
			  
	public int[] toArray() {
		
		int[] array = new int[this.size];
		
		for (int i = 0; i < this.size; i++)
			array[i] = this.elements[i];
		
		return array;		
			
	}
			  
	public void ensureCapacity(int minCapacity) {
		
		if (minCapacity > this.elements.length)
			this.elements = Arrays.copyOf(this.elements, minCapacity);
				  
	}
			  
	public void trimToSize() {
		
		this.elements = Arrays.copyOf(this.elements, this.size);
		
				  
	}

}
