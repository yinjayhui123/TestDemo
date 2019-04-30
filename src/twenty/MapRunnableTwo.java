/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package twenty;

/**
 * @author yinhui
 * @version MapRunnable, v0.1 2018/11/8 15:34
 */
public class MapRunnableTwo implements Runnable {

    private MapSelNum mapSelNum;
    private String username;
    private final int code ;

    public MapRunnableTwo(MapSelNum mapSelNum, String username, int code){
        this.mapSelNum = mapSelNum;
        this.username = username;
        this.code = code;
    }

    @Override
    public void run() {
        mapSelNum.addI(username,code+"");
//        mapSelNum.setMap(username,code+"");

    }

}
