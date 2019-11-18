package shiyan;

public class jiaru {
	public static void main(String[] args) {
		  String str =new String("汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>" ); 
		  int x=0;
		  int y=7;
		  int w=14;
		  String a[]=new String[17];
		  String b[]=new String[17];
		  for(int i=0;i<17;i++) {
		   a[i]=str.substring(x,y);
		   b[i]=str.substring(y,w);
		      System.out.print(a[i]+","+b[i]+"。"+"\n");
		      x=x+14;
		      y=y+14;
		      w=w+14;
		      
		  }
		 }
		}