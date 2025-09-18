package io.kestra.core.lineage;

import io.kestra.core.models.HasUID;
import io.kestra.core.utils.IdUtils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
public class DataSet implements HasUID {
    private String tenantId;
    private String namespace;
    private String name;


    @Override
    public String uid() {
        return IdUtils.fromParts(tenantId, namespace, name);
    }
}
