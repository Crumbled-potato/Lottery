package cn.itedus.lottery.rpc.req;

import java.io.Serializable;
import java.util.Map;

/**
 * @description:
 * @author：cheese，微信：
 * @date: 2024-01-28
 * @Copyright： 公众号：
 */
public class QuantificationDrawReq implements Serializable {

    /** 用户ID */
    private String uId;
    /** 规则树ID */
    private Long treeId;
    /** 决策值 */
    private Map<String, Object> valMap;

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Map<String, Object> getValMap() {
        return valMap;
    }

    public void setValMap(Map<String, Object> valMap) {
        this.valMap = valMap;
    }
}
