package com.entity.vo;

import com.entity.GuwenChatEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 用户咨询
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("guwen_chat")
public class GuwenChatVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 提问人
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 回答人
     */

    @TableField(value = "guwen_id")
    private Integer guwenId;


    /**
     * 问题
     */

    @TableField(value = "guwen_chat_issue_text")
    private String guwenChatIssueText;


    /**
     * 问题时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "issue_time")
    private Date issueTime;


    /**
     * 回复
     */

    @TableField(value = "guwen_chat_reply_text")
    private String guwenChatReplyText;


    /**
     * 回复时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "reply_time")
    private Date replyTime;


    /**
     * 状态
     */

    @TableField(value = "zhuangtai_types")
    private Integer zhuangtaiTypes;


    /**
     * 数据类型
     */

    @TableField(value = "guwen_chat_types")
    private Integer guwenChatTypes;


    /**
     * 提问时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：提问人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：提问人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：回答人
	 */
    public Integer getGuwenId() {
        return guwenId;
    }


    /**
	 * 获取：回答人
	 */

    public void setGuwenId(Integer guwenId) {
        this.guwenId = guwenId;
    }
    /**
	 * 设置：问题
	 */
    public String getGuwenChatIssueText() {
        return guwenChatIssueText;
    }


    /**
	 * 获取：问题
	 */

    public void setGuwenChatIssueText(String guwenChatIssueText) {
        this.guwenChatIssueText = guwenChatIssueText;
    }
    /**
	 * 设置：问题时间
	 */
    public Date getIssueTime() {
        return issueTime;
    }


    /**
	 * 获取：问题时间
	 */

    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }
    /**
	 * 设置：回复
	 */
    public String getGuwenChatReplyText() {
        return guwenChatReplyText;
    }


    /**
	 * 获取：回复
	 */

    public void setGuwenChatReplyText(String guwenChatReplyText) {
        this.guwenChatReplyText = guwenChatReplyText;
    }
    /**
	 * 设置：回复时间
	 */
    public Date getReplyTime() {
        return replyTime;
    }


    /**
	 * 获取：回复时间
	 */

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }
    /**
	 * 设置：状态
	 */
    public Integer getZhuangtaiTypes() {
        return zhuangtaiTypes;
    }


    /**
	 * 获取：状态
	 */

    public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
        this.zhuangtaiTypes = zhuangtaiTypes;
    }
    /**
	 * 设置：数据类型
	 */
    public Integer getGuwenChatTypes() {
        return guwenChatTypes;
    }


    /**
	 * 获取：数据类型
	 */

    public void setGuwenChatTypes(Integer guwenChatTypes) {
        this.guwenChatTypes = guwenChatTypes;
    }
    /**
	 * 设置：提问时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：提问时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
