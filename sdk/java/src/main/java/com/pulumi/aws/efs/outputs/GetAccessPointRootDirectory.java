// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs.outputs;

import com.pulumi.aws.efs.outputs.GetAccessPointRootDirectoryCreationInfo;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccessPointRootDirectory {
    /**
     * @return Single element list containing information on the creation permissions of the directory
     * 
     */
    private List<GetAccessPointRootDirectoryCreationInfo> creationInfos;
    /**
     * @return Path exposed as the root directory
     * 
     */
    private String path;

    private GetAccessPointRootDirectory() {}
    /**
     * @return Single element list containing information on the creation permissions of the directory
     * 
     */
    public List<GetAccessPointRootDirectoryCreationInfo> creationInfos() {
        return this.creationInfos;
    }
    /**
     * @return Path exposed as the root directory
     * 
     */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointRootDirectory defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAccessPointRootDirectoryCreationInfo> creationInfos;
        private String path;
        public Builder() {}
        public Builder(GetAccessPointRootDirectory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationInfos = defaults.creationInfos;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder creationInfos(List<GetAccessPointRootDirectoryCreationInfo> creationInfos) {
            this.creationInfos = Objects.requireNonNull(creationInfos);
            return this;
        }
        public Builder creationInfos(GetAccessPointRootDirectoryCreationInfo... creationInfos) {
            return creationInfos(List.of(creationInfos));
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public GetAccessPointRootDirectory build() {
            final var o = new GetAccessPointRootDirectory();
            o.creationInfos = creationInfos;
            o.path = path;
            return o;
        }
    }
}
