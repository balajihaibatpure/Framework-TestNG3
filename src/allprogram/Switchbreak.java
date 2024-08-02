package allprogram;

public class Switchbreak {

	public static void main(String[] args) {
		int instrument=4;
		String musicinstrument;
       switch (instrument) 
       {
	    case 1: 
		
	    	musicinstrument="gitar";
		break;
		
		case 2:
			musicinstrument="piano";
		break;
		case 3:
			musicinstrument="drum";
		break;
		case 4:
			musicinstrument= "flute";
		break;
		case 5:
			musicinstrument="violin";
		break;
		default:
			musicinstrument="invalid";
		break;
		
      }
       System.out.println(musicinstrument);
	}
	
	
	}