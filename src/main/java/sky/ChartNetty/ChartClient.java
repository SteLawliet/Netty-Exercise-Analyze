package sky.ChartNetty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @program: Netty-Exercise-Analyze
 * @description: ChartClient
 * @author: Zhaoziqi
 * @create: 2019-01-29 23:54
 **/
public class ChartClient {
    public static void main(String[] args) {
        EventLoopGroup loopGroup = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        ChannelFuture connect = bootstrap.group(loopGroup)
                .channel(NioSocketChannel.class)
                .connect("127.0.0.1",8087);

        try {
            connect.sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
