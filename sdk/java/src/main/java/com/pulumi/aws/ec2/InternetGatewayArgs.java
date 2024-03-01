// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InternetGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final InternetGatewayArgs Empty = new InternetGatewayArgs();

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     * &gt; **Note:** It&#39;s recommended to denote that the AWS Instance or Elastic IP depends on the Internet Gateway. For example:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ec2.InternetGateway;
     * import com.pulumi.aws.ec2.InternetGatewayArgs;
     * import com.pulumi.aws.ec2.Instance;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var gw = new InternetGateway(&#34;gw&#34;, InternetGatewayArgs.builder()        
     *             .vpcId(main.id())
     *             .build());
     * 
     *         var foo = new Instance(&#34;foo&#34;);
     * 
     *     }
     * }
     * ```
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     * &gt; **Note:** It&#39;s recommended to denote that the AWS Instance or Elastic IP depends on the Internet Gateway. For example:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.ec2.InternetGateway;
     * import com.pulumi.aws.ec2.InternetGatewayArgs;
     * import com.pulumi.aws.ec2.Instance;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         var gw = new InternetGateway(&#34;gw&#34;, InternetGatewayArgs.builder()        
     *             .vpcId(main.id())
     *             .build());
     * 
     *         var foo = new Instance(&#34;foo&#34;);
     * 
     *     }
     * }
     * ```
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The VPC ID to create in.  See the aws.ec2.InternetGatewayAttachment resource for an alternate way to attach an Internet Gateway to a VPC.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The VPC ID to create in.  See the aws.ec2.InternetGatewayAttachment resource for an alternate way to attach an Internet Gateway to a VPC.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private InternetGatewayArgs() {}

    private InternetGatewayArgs(InternetGatewayArgs $) {
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InternetGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InternetGatewayArgs $;

        public Builder() {
            $ = new InternetGatewayArgs();
        }

        public Builder(InternetGatewayArgs defaults) {
            $ = new InternetGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * &gt; **Note:** It&#39;s recommended to denote that the AWS Instance or Elastic IP depends on the Internet Gateway. For example:
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.aws.ec2.InternetGateway;
         * import com.pulumi.aws.ec2.InternetGatewayArgs;
         * import com.pulumi.aws.ec2.Instance;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *         var gw = new InternetGateway(&#34;gw&#34;, InternetGatewayArgs.builder()        
         *             .vpcId(main.id())
         *             .build());
         * 
         *         var foo = new Instance(&#34;foo&#34;);
         * 
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * &gt; **Note:** It&#39;s recommended to denote that the AWS Instance or Elastic IP depends on the Internet Gateway. For example:
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.aws.ec2.InternetGateway;
         * import com.pulumi.aws.ec2.InternetGatewayArgs;
         * import com.pulumi.aws.ec2.Instance;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *         var gw = new InternetGateway(&#34;gw&#34;, InternetGatewayArgs.builder()        
         *             .vpcId(main.id())
         *             .build());
         * 
         *         var foo = new Instance(&#34;foo&#34;);
         * 
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcId The VPC ID to create in.  See the aws.ec2.InternetGatewayAttachment resource for an alternate way to attach an Internet Gateway to a VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The VPC ID to create in.  See the aws.ec2.InternetGatewayAttachment resource for an alternate way to attach an Internet Gateway to a VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public InternetGatewayArgs build() {
            return $;
        }
    }

}
