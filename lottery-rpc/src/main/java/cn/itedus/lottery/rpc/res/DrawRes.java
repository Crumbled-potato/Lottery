package cn.itedus.lottery.rpc.res;

import cn.itedus.lottery.common.Result;
import cn.itedus.lottery.rpc.dto.AwardDTO;

import java.io.Serializable;

/**
 * @description:
 * @author：cheese，微信：
 * @date: 2024-01-28
 * @Copyright： 公众号：
 */
public class DrawRes extends Result implements Serializable {

    private AwardDTO awardDTO;

    public DrawRes(String code, String info) {
        super(code, info);
    }

    public AwardDTO getAwardDTO() {
        return awardDTO;
    }

    public void setAwardDTO(AwardDTO awardDTO){
        this.awardDTO = awardDTO;
    }
}
