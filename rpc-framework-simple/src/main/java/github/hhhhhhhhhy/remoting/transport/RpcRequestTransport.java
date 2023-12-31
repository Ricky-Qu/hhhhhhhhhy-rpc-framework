package github.hhhhhhhhhy.remoting.transport;

import github.hhhhhhhhhy.extension.SPI;
import github.hhhhhhhhhy.remoting.dto.RpcRequest;

/**
 * send RpcRequest。
 *
 * @author hhhhhhhhhy
 * @createTime 2023年05月29日 13:26:00
 */
@SPI
public interface RpcRequestTransport {
    /**
     * send rpc request to server and get result
     *
     * @param rpcRequest message body
     * @return data from server
     */
    Object sendRpcRequest(RpcRequest rpcRequest);
}
