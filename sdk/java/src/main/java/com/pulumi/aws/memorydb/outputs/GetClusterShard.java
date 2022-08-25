// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.memorydb.outputs;

import com.pulumi.aws.memorydb.outputs.GetClusterShardNode;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterShard {
    /**
     * @return Name of the cluster.
     * 
     */
    private String name;
    /**
     * @return Set of nodes in this shard.
     * 
     */
    private List<GetClusterShardNode> nodes;
    /**
     * @return Number of individual nodes in this shard.
     * 
     */
    private Integer numNodes;
    /**
     * @return Keyspace for this shard. Example: `0-16383`.
     * 
     */
    private String slots;

    private GetClusterShard() {}
    /**
     * @return Name of the cluster.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Set of nodes in this shard.
     * 
     */
    public List<GetClusterShardNode> nodes() {
        return this.nodes;
    }
    /**
     * @return Number of individual nodes in this shard.
     * 
     */
    public Integer numNodes() {
        return this.numNodes;
    }
    /**
     * @return Keyspace for this shard. Example: `0-16383`.
     * 
     */
    public String slots() {
        return this.slots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterShard defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private List<GetClusterShardNode> nodes;
        private Integer numNodes;
        private String slots;
        public Builder() {}
        public Builder(GetClusterShard defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.nodes = defaults.nodes;
    	      this.numNodes = defaults.numNodes;
    	      this.slots = defaults.slots;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nodes(List<GetClusterShardNode> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public Builder nodes(GetClusterShardNode... nodes) {
            return nodes(List.of(nodes));
        }
        @CustomType.Setter
        public Builder numNodes(Integer numNodes) {
            this.numNodes = Objects.requireNonNull(numNodes);
            return this;
        }
        @CustomType.Setter
        public Builder slots(String slots) {
            this.slots = Objects.requireNonNull(slots);
            return this;
        }
        public GetClusterShard build() {
            final var o = new GetClusterShard();
            o.name = name;
            o.nodes = nodes;
            o.numNodes = numNodes;
            o.slots = slots;
            return o;
        }
    }
}
