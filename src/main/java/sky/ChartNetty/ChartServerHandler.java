package sky.ChartNetty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @program: Netty-Exercise-Analyze
 * @description: ChartHandler
 * @author: Zhaoziqi
 * @create: 2019-01-29 23:55
 **/
public class ChartServerHandler extends SimpleChannelInboundHandler<String> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {

    }
}
