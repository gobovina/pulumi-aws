// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloud9;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloud9.EnvironmentEC2Args;
import com.pulumi.aws.cloud9.inputs.EnvironmentEC2State;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud9 EC2 Development Environment.
 * 
 * ## Example Usage
 * 
 * Basic usage:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloud9.EnvironmentEC2;
 * import com.pulumi.aws.cloud9.EnvironmentEC2Args;
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
 *         var example = new EnvironmentEC2(&#34;example&#34;, EnvironmentEC2Args.builder()        
 *             .instanceType(&#34;t2.micro&#34;)
 *             .name(&#34;example-env&#34;)
 *             .imageId(&#34;amazonlinux-2023-x86_64&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Get the URL of the Cloud9 environment after creation:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloud9.EnvironmentEC2;
 * import com.pulumi.aws.cloud9.EnvironmentEC2Args;
 * import com.pulumi.aws.ec2.Ec2Functions;
 * import com.pulumi.aws.ec2.inputs.GetInstanceArgs;
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
 *         var example = new EnvironmentEC2(&#34;example&#34;, EnvironmentEC2Args.builder()        
 *             .instanceType(&#34;t2.micro&#34;)
 *             .build());
 * 
 *         final var cloud9Instance = Ec2Functions.getInstance(GetInstanceArgs.builder()
 *             .filters(GetInstanceFilterArgs.builder()
 *                 .name(&#34;tag:aws:cloud9:environment&#34;)
 *                 .values(example.id())
 *                 .build())
 *             .build());
 * 
 *         ctx.export(&#34;cloud9Url&#34;, example.id().applyValue(id -&gt; String.format(&#34;https://%s.console.aws.amazon.com/cloud9/ide/%s&#34;, region,id)));
 *     }
 * }
 * ```
 * 
 * Allocate a static IP to the Cloud9 environment:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloud9.EnvironmentEC2;
 * import com.pulumi.aws.cloud9.EnvironmentEC2Args;
 * import com.pulumi.aws.ec2.Ec2Functions;
 * import com.pulumi.aws.ec2.inputs.GetInstanceArgs;
 * import com.pulumi.aws.ec2.Eip;
 * import com.pulumi.aws.ec2.EipArgs;
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
 *         var example = new EnvironmentEC2(&#34;example&#34;, EnvironmentEC2Args.builder()        
 *             .instanceType(&#34;t2.micro&#34;)
 *             .build());
 * 
 *         final var cloud9Instance = Ec2Functions.getInstance(GetInstanceArgs.builder()
 *             .filters(GetInstanceFilterArgs.builder()
 *                 .name(&#34;tag:aws:cloud9:environment&#34;)
 *                 .values(example.id())
 *                 .build())
 *             .build());
 * 
 *         var cloud9Eip = new Eip(&#34;cloud9Eip&#34;, EipArgs.builder()        
 *             .instance(cloud9Instance.applyValue(getInstanceResult -&gt; getInstanceResult).applyValue(cloud9Instance -&gt; cloud9Instance.applyValue(getInstanceResult -&gt; getInstanceResult.id())))
 *             .domain(&#34;vpc&#34;)
 *             .build());
 * 
 *         ctx.export(&#34;cloud9PublicIp&#34;, cloud9Eip.publicIp());
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:cloud9/environmentEC2:EnvironmentEC2")
public class EnvironmentEC2 extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the environment.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the environment.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The number of minutes until the running instance is shut down after the environment has last been used.
     * 
     */
    @Export(name="automaticStopTimeMinutes", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> automaticStopTimeMinutes;

    /**
     * @return The number of minutes until the running instance is shut down after the environment has last been used.
     * 
     */
    public Output<Optional<Integer>> automaticStopTimeMinutes() {
        return Codegen.optional(this.automaticStopTimeMinutes);
    }
    /**
     * The connection type used for connecting to an Amazon EC2 environment. Valid values are `CONNECT_SSH` and `CONNECT_SSM`. For more information please refer [AWS documentation for Cloud9](https://docs.aws.amazon.com/cloud9/latest/user-guide/ec2-ssm.html).
     * 
     */
    @Export(name="connectionType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> connectionType;

    /**
     * @return The connection type used for connecting to an Amazon EC2 environment. Valid values are `CONNECT_SSH` and `CONNECT_SSM`. For more information please refer [AWS documentation for Cloud9](https://docs.aws.amazon.com/cloud9/latest/user-guide/ec2-ssm.html).
     * 
     */
    public Output<Optional<String>> connectionType() {
        return Codegen.optional(this.connectionType);
    }
    /**
     * The description of the environment.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the environment.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The identifier for the Amazon Machine Image (AMI) that&#39;s used to create the EC2 instance. Valid values are
     * * `amazonlinux-1-x86_64`
     * * `amazonlinux-2-x86_64`
     * * `amazonlinux-2023-x86_64`
     * * `ubuntu-18.04-x86_64`
     * * `ubuntu-22.04-x86_64`
     * * `resolve:ssm:/aws/service/cloud9/amis/amazonlinux-1-x86_64`
     * * `resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2-x86_64`
     * * `resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2023-x86_64`
     * * `resolve:ssm:/aws/service/cloud9/amis/ubuntu-18.04-x86_64`
     * * `resolve:ssm:/aws/service/cloud9/amis/ubuntu-22.04-x86_64`
     * 
     */
    @Export(name="imageId", refs={String.class}, tree="[0]")
    private Output<String> imageId;

    /**
     * @return The identifier for the Amazon Machine Image (AMI) that&#39;s used to create the EC2 instance. Valid values are
     * * `amazonlinux-1-x86_64`
     * * `amazonlinux-2-x86_64`
     * * `amazonlinux-2023-x86_64`
     * * `ubuntu-18.04-x86_64`
     * * `ubuntu-22.04-x86_64`
     * * `resolve:ssm:/aws/service/cloud9/amis/amazonlinux-1-x86_64`
     * * `resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2-x86_64`
     * * `resolve:ssm:/aws/service/cloud9/amis/amazonlinux-2023-x86_64`
     * * `resolve:ssm:/aws/service/cloud9/amis/ubuntu-18.04-x86_64`
     * * `resolve:ssm:/aws/service/cloud9/amis/ubuntu-22.04-x86_64`
     * 
     */
    public Output<String> imageId() {
        return this.imageId;
    }
    /**
     * The type of instance to connect to the environment, e.g., `t2.micro`.
     * 
     */
    @Export(name="instanceType", refs={String.class}, tree="[0]")
    private Output<String> instanceType;

    /**
     * @return The type of instance to connect to the environment, e.g., `t2.micro`.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }
    /**
     * The name of the environment.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the environment.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ARN of the environment owner. This can be ARN of any AWS IAM principal. Defaults to the environment&#39;s creator.
     * 
     */
    @Export(name="ownerArn", refs={String.class}, tree="[0]")
    private Output<String> ownerArn;

    /**
     * @return The ARN of the environment owner. This can be ARN of any AWS IAM principal. Defaults to the environment&#39;s creator.
     * 
     */
    public Output<String> ownerArn() {
        return this.ownerArn;
    }
    /**
     * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
     * 
     */
    @Export(name="subnetId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subnetId;

    /**
     * @return The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
     * 
     */
    public Output<Optional<String>> subnetId() {
        return Codegen.optional(this.subnetId);
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The type of the environment (e.g., `ssh` or `ec2`).
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of the environment (e.g., `ssh` or `ec2`).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnvironmentEC2(String name) {
        this(name, EnvironmentEC2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnvironmentEC2(String name, EnvironmentEC2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnvironmentEC2(String name, EnvironmentEC2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloud9/environmentEC2:EnvironmentEC2", name, args == null ? EnvironmentEC2Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EnvironmentEC2(String name, Output<String> id, @Nullable EnvironmentEC2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloud9/environmentEC2:EnvironmentEC2", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EnvironmentEC2 get(String name, Output<String> id, @Nullable EnvironmentEC2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EnvironmentEC2(name, id, state, options);
    }
}
