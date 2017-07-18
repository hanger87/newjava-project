	public class Rectangulator {
        public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int width = Integer.ParseInt(args[1]);

        Rectangle myrectangle = new Rectangle(length, width);

        String output = String.format("*** your Rectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n", myRectangle.length, myRectangle.width, myRec        tangle.getArea(), myRectangle.getPerimeter());

        System.out.println(output);
        }
  }

