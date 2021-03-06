package com.alibaba.csp.sentinel.dashboard.rule.apollo;

public class ApolloConfigUtil {

    public static final String FLOW_DATA_ID_POSTFIX = "-flow-rules";

    private ApolloConfigUtil() {

    }

    public static String getFlowDataId(String appName) {
        return String.format("%s%s", appName, FLOW_DATA_ID_POSTFIX);
    }

}
