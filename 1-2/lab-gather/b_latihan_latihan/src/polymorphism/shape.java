package polymorphism;

class shape {
	void draw(){
		System.out.println("drawing...");
		}  
	}  

class rectangle extends shape {
	@Override
	void draw(){
		System.out.println("drawing rectangle");
		}  
	} 

class circle extends shape {
	@Override
	void draw(){
		System.out.println("drawing circle");
		}  
	} 

class triangle extends shape {
	@Override
	void draw(){
		System.out.println("drawing triangle");
		}  
	} 
