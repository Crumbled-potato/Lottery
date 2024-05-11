package cn.itedus.lottery.application.process.res;

import cn.itedus.lottery.common.Result;
import cn.itedus.lottery.domain.strategy.model.vo.DrawAwardVO;
/**
 * @description:
 * @author：cheese，微信：
 * @date: 2024-01-26
 * @Copyright： 公众号：
 */
public class DrawProcessResult extends Result {
    private DrawAwardVO drawAwardVO;

    public DrawProcessResult(String code, String info) {
        super(code, info);
    }
    public DrawProcessResult(String code, String info, DrawAwardVO drawAwardInfo) {
        super(code, info);
        this.drawAwardVO = drawAwardInfo;
    }
    public DrawAwardVO getDrawAwardVO() {

        return drawAwardVO;
    }

    public void setDrawAwardInfo(DrawAwardVO drawAwardInfo) {

        this.drawAwardVO = drawAwardInfo;
    }
}
