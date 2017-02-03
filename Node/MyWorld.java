import greenfoot.*;  
import java.util.ArrayList;

public class MyWorld extends World
{
    private Node node, first, last;
    ArrayList<Node> nodes = new ArrayList<Node>();
    public MyWorld()
    {
        super(600, 400, 1); 
        node = new Node(null);
        first = node;
        addObject(node, 300, 200);
        System.out.println("here");
        for (int j = 1; j < 10; j++){
            node = new Node(node);
            addObject(node, 300, 200);
            last = node;
            nodes.add(node);
        }

    }

    public void act(){
        String key = Greenfoot.getKey();
        if (key != null){
            if ( key.equals("n")){
                addNode();
            }

            if ( key.equals("r")){
                removeNode();
            }

            if( key.equals("l")){
                removeFirstNode();
            }
        }
    }

    public int[] getNewLocation(){
        int[] location;
        if(getObjects(null).contains(first)){
            location = new int[]{first.getX(), first.getY()};
        }else{
            location = new int[]{Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight())};
        }
        return location;
    }

    public void addNode(){
        node = new Node(last);
        if(first == null){
            first = node;
        }
        int[] loc = getNewLocation();
        last = node;
        addObject(node, loc[0], loc[1]);
        nodes.add(node);
    }

    public void removeNode(){
        if ( last != null ){
            removeObject(last);
            last = last.getTarget();
            first = last == null ? null : first;
            nodes.remove(node);
        }
    }

    public void removeFirstNode(){
        if ( first != null ){
            removeObject(first);
            nodes.remove(node);
        }
        for( int i = 0; i < nodes.size(); i++ )
        {
            Node node = nodes.get(i);
            if( node != null )
            {
                if( node.isLeader() == true)
                {
                    node = first;
                    i = nodes.size() +1;
                }
            }
        }//end for
    }

}
