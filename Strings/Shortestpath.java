public class Shortestpath {

    public static float GetShortestPath(String path){
        int x=0, y=0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);

            switch (Character.toUpperCase(dir)) {
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'N':
                    y++;
                    break;
                default:
                    y--;
                    break;
            }
        }
        int x2 =x*x;
        int y2 =y*y;

        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path ="newsneswnee";
        System.out.print(GetShortestPath(path));
    }
}
