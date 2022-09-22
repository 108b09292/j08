class CBox
{
   int length;         
   int width;
   int height;    
   int volume()           // 定義成員函數volume(), 用來計算box物件的體積
   {
      return width*height*length;       // 傳回box的體積
   }
   int surfaceArea()           // 定義成員函數surfaceArea(), 用來計算box物件的表面積
   {
      return 2 * (length * width + width * height + height * length);       // 傳回box的表面積
   }
   void showData() {
	   System.out.println("length:"+length+",width:"+width+",height"+height);
   }
   void showAll() {
	   System.out.println("length:"+length+",width:"+width+",height"+height);
	   System.out.println("surfaceArea="+2 * (length * width + width * height + height * length));
	   System.out.println("volume="+width*height*length);
   }
}

public class J085 {

    public static void main(String args[]){
        CBox box;
        box=new CBox();
        		
        box.length=2;
        box.width=2;
        box.height=2;
        box.showData();
        box.showAll();
        
        


   }
}
