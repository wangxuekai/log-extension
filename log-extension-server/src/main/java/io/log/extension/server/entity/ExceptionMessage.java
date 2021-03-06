package io.log.extension.server.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

@Document(indexName = "logx", type = "exceptionMessage", shards = 5, replicas = 0, refreshInterval = "-1")
public class ExceptionMessage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    /**
     * 上下文
     */
    private String domain;
    /**
     * 类名称
     */
    private String className;
    /**
     * 方法名
     */
    private String classMethod;
    /**
     * 当前消息
     */
    private String messageId;
    /**
     * 父消息
     */
    private String parentMessageId;
    /**
     * 当前项目根消息
     */
    private String currentRootMessageId;
    /**
     * 根消息
     */
    private String rootMessageId;
    /**
     * 当前节点
     */
    private String host;
    /**
     * 消息时间
     */
    private Long time;
    /**
     * 开始时间
     */
    private Date start;
    /**
     * 结束时间
     */
    private Date end;
    /**
     * 状态
     */
    private String status;
    /**
     * 内容
     */
    private String content;
    /**
     * 是否是根消息
     */
    private Boolean isRootMessage;
    /**
     * 消息链是否有异常
     */
    private Boolean hasError;
    /**
     * 根消息类名称
     */
    private String rootClassName;
    /**
     * 根消息方法名
     */
    private String rootMethodName;
    /**
     * 消息类型
     */
    private String messageType;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassMethod() {
        return classMethod;
    }

    public void setClassMethod(String classMethod) {
        this.classMethod = classMethod;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getParentMessageId() {
        return parentMessageId;
    }

    public void setParentMessageId(String parentMessageId) {
        this.parentMessageId = parentMessageId;
    }

    public String getCurrentRootMessageId() {
        return currentRootMessageId;
    }

    public void setCurrentRootMessageId(String currentRootMessageId) {
        this.currentRootMessageId = currentRootMessageId;
    }

    public String getRootMessageId() {
        return rootMessageId;
    }

    public void setRootMessageId(String rootMessageId) {
        this.rootMessageId = rootMessageId;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getIsRootMessage() {
        return isRootMessage;
    }

    public void setIsRootMessage(Boolean isRootMessage) {
        this.isRootMessage = isRootMessage;
    }

    public Boolean getHasError() {
        return hasError;
    }

    public void setHasError(Boolean hasError) {
        this.hasError = hasError;
    }

    public String getRootClassName() {
        return rootClassName;
    }

    public void setRootClassName(String rootClassName) {
        this.rootClassName = rootClassName;
    }

    public String getRootMethodName() {
        return rootMethodName;
    }

    public void setRootMethodName(String rootMethodName) {
        this.rootMethodName = rootMethodName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getRootMessage() {
        return isRootMessage;
    }

    public void setRootMessage(Boolean rootMessage) {
        isRootMessage = rootMessage;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
