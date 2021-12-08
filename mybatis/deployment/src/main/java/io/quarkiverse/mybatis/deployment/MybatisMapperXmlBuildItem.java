package io.quarkiverse.mybatis.deployment;

import io.quarkus.builder.item.MultiBuildItem;

public final class MybatisMapperXmlBuildItem extends MultiBuildItem {
    private final String[] sourcesNames;
    private final String dataSourceName;

    public MybatisMapperXmlBuildItem(String[] sourcesNames, String dataSourceName) {
        this.sourcesNames = sourcesNames;
        this.dataSourceName = dataSourceName;
    }

    public String[] getSourcesNames() {
        return sourcesNames;
    }

    public String getDataSourceName() {
        return dataSourceName;
    }
}
