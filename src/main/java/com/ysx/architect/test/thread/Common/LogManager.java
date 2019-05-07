package com.ysx.architect.test.thread.Common;


import ch.qos.logback.core.joran.util.beans.BeanUtil;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;

public class LogManager {
    private Log logger = null;
    private Logger log4j = null;
    private Class<?> clazsz = null;

    private LogManager() {
    }

    public static LogManager getLogger(Class<?> clazz) {
        LogManager logManager = new LogManager();
        logManager.clazsz = clazz;
        return logManager;
    }

    private void checkLogger() {
        if (this.logger == null) {
            try {
                //this.logger = (Log)BeanUtil.getBean("logger");
            } catch (Exception var2) {
                ;
            }

            if (this.logger == null) {
                //this.logger = new LoggerLog4j();
            }

            //this.logger.setLoggerClass(this.clazsz);
        }

    }

    private void checkLog4j() {
        if (this.log4j == null) {
            //this.log4j = Logger.getLogger(this.clazsz);
        }

    }

    public boolean isDebugEnabled() {
        /*if (BeanUtil.beanUtilSystemFinishInit) {
            this.checkLogger();
            return this.logger.isDebugEnabled();
        } else {
            this.checkLog4j();
            return this.log4j.isDebugEnabled();
        }*/
        return true;
    }

    public void debug(Object message) {
        /*if (BeanUtil.beanUtilSystemFinishInit) {
            this.checkLogger();
            this.logger.debug(message);
        } else {
            this.checkLog4j();
            this.log4j.debug(message);
        }*/

    }

    public void debug(Object message, Throwable t) {
        /*if (BeanUtil.beanUtilSystemFinishInit) {
            this.checkLogger();
            this.logger.debug(message, t);
        } else {
            this.checkLog4j();
            this.log4j.debug(message, t);
        }*/

    }

    public void info(Object message) {
        /*if (BeanUtil.beanUtilSystemFinishInit) {
            this.checkLogger();
            this.logger.info(message);
        } else {
            this.checkLog4j();
            this.log4j.info(message);
        }*/

    }

    public void info(Object message, Throwable t) {
        /*if (BeanUtil.beanUtilSystemFinishInit) {
            this.checkLogger();
            this.logger.info(message, t);
        } else {
            this.checkLog4j();
            this.log4j.info(message, t);
        }*/

    }

    public void warn(Object message) {
        /*if (BeanUtil.beanUtilSystemFinishInit) {
            this.checkLogger();
            this.logger.warn(message);
        } else {
            this.checkLog4j();
            this.log4j.warn(message);
        }*/

    }

    public void warn(Object message, Throwable t) {
        /*if (BeanUtil.beanUtilSystemFinishInit) {
            this.checkLogger();
            this.logger.warn(message, t);
        } else {
            this.checkLog4j();
            this.log4j.warn(message, t);
        }*/

    }

    public void error(Object message) {
        /*if (BeanUtil.beanUtilSystemFinishInit) {
            this.checkLogger();
            this.logger.error(message);
        } else {
            this.checkLog4j();
            this.log4j.error(message);
        }*/

    }

    public void error(Object message, Throwable t) {
        /*if (BeanUtil.beanUtilSystemFinishInit) {
            this.checkLogger();
            this.logger.error(message, t);
        } else {
            this.checkLog4j();
            this.log4j.error(message, t);
        }*/

    }

    public void fatal(Object message) {
        /*if (BeanUtil.beanUtilSystemFinishInit) {
            this.checkLogger();
            this.logger.fatal(message);
        } else {
            this.checkLog4j();
            this.log4j.fatal(message);
        }*/

    }

    public void fatal(Object message, Throwable t) {
        /*if (BeanUtil.beanUtilSystemFinishInit) {
            this.checkLogger();
            this.logger.fatal(message, t);
        } else {
            this.checkLog4j();
            this.log4j.fatal(message, t);
        }*/

    }
}
