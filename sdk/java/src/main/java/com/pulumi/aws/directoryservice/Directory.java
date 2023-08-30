// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.directoryservice.DirectoryArgs;
import com.pulumi.aws.directoryservice.inputs.DirectoryState;
import com.pulumi.aws.directoryservice.outputs.DirectoryConnectSettings;
import com.pulumi.aws.directoryservice.outputs.DirectoryVpcSettings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Simple or Managed Microsoft directory in AWS Directory Service.
 * 
 * ## Example Usage
 * ### SimpleAD
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.ec2.Subnet;
 * import com.pulumi.aws.ec2.SubnetArgs;
 * import com.pulumi.aws.directoryservice.Directory;
 * import com.pulumi.aws.directoryservice.DirectoryArgs;
 * import com.pulumi.aws.directoryservice.inputs.DirectoryVpcSettingsArgs;
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
 *         var main = new Vpc(&#34;main&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var foo = new Subnet(&#34;foo&#34;, SubnetArgs.builder()        
 *             .vpcId(main.id())
 *             .availabilityZone(&#34;us-west-2a&#34;)
 *             .cidrBlock(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var barSubnet = new Subnet(&#34;barSubnet&#34;, SubnetArgs.builder()        
 *             .vpcId(main.id())
 *             .availabilityZone(&#34;us-west-2b&#34;)
 *             .cidrBlock(&#34;10.0.2.0/24&#34;)
 *             .build());
 * 
 *         var barDirectory = new Directory(&#34;barDirectory&#34;, DirectoryArgs.builder()        
 *             .name(&#34;corp.notexample.com&#34;)
 *             .password(&#34;SuperSecretPassw0rd&#34;)
 *             .size(&#34;Small&#34;)
 *             .vpcSettings(DirectoryVpcSettingsArgs.builder()
 *                 .vpcId(main.id())
 *                 .subnetIds(                
 *                     foo.id(),
 *                     barSubnet.id())
 *                 .build())
 *             .tags(Map.of(&#34;Project&#34;, &#34;foo&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Microsoft Active Directory (MicrosoftAD)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.ec2.Subnet;
 * import com.pulumi.aws.ec2.SubnetArgs;
 * import com.pulumi.aws.directoryservice.Directory;
 * import com.pulumi.aws.directoryservice.DirectoryArgs;
 * import com.pulumi.aws.directoryservice.inputs.DirectoryVpcSettingsArgs;
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
 *         var main = new Vpc(&#34;main&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var foo = new Subnet(&#34;foo&#34;, SubnetArgs.builder()        
 *             .vpcId(main.id())
 *             .availabilityZone(&#34;us-west-2a&#34;)
 *             .cidrBlock(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var barSubnet = new Subnet(&#34;barSubnet&#34;, SubnetArgs.builder()        
 *             .vpcId(main.id())
 *             .availabilityZone(&#34;us-west-2b&#34;)
 *             .cidrBlock(&#34;10.0.2.0/24&#34;)
 *             .build());
 * 
 *         var barDirectory = new Directory(&#34;barDirectory&#34;, DirectoryArgs.builder()        
 *             .name(&#34;corp.notexample.com&#34;)
 *             .password(&#34;SuperSecretPassw0rd&#34;)
 *             .edition(&#34;Standard&#34;)
 *             .type(&#34;MicrosoftAD&#34;)
 *             .vpcSettings(DirectoryVpcSettingsArgs.builder()
 *                 .vpcId(main.id())
 *                 .subnetIds(                
 *                     foo.id(),
 *                     barSubnet.id())
 *                 .build())
 *             .tags(Map.of(&#34;Project&#34;, &#34;foo&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Microsoft Active Directory Connector (ADConnector)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.Vpc;
 * import com.pulumi.aws.ec2.VpcArgs;
 * import com.pulumi.aws.ec2.Subnet;
 * import com.pulumi.aws.ec2.SubnetArgs;
 * import com.pulumi.aws.directoryservice.Directory;
 * import com.pulumi.aws.directoryservice.DirectoryArgs;
 * import com.pulumi.aws.directoryservice.inputs.DirectoryConnectSettingsArgs;
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
 *         var main = new Vpc(&#34;main&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .build());
 * 
 *         var foo = new Subnet(&#34;foo&#34;, SubnetArgs.builder()        
 *             .vpcId(main.id())
 *             .availabilityZone(&#34;us-west-2a&#34;)
 *             .cidrBlock(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var bar = new Subnet(&#34;bar&#34;, SubnetArgs.builder()        
 *             .vpcId(main.id())
 *             .availabilityZone(&#34;us-west-2b&#34;)
 *             .cidrBlock(&#34;10.0.2.0/24&#34;)
 *             .build());
 * 
 *         var connector = new Directory(&#34;connector&#34;, DirectoryArgs.builder()        
 *             .name(&#34;corp.notexample.com&#34;)
 *             .password(&#34;SuperSecretPassw0rd&#34;)
 *             .size(&#34;Small&#34;)
 *             .type(&#34;ADConnector&#34;)
 *             .connectSettings(DirectoryConnectSettingsArgs.builder()
 *                 .customerDnsIps(&#34;A.B.C.D&#34;)
 *                 .customerUsername(&#34;Admin&#34;)
 *                 .subnetIds(                
 *                     foo.id(),
 *                     bar.id())
 *                 .vpcId(main.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import DirectoryService directories using the directory `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:directoryservice/directory:Directory sample d-926724cf57
 * ```
 * 
 */
@ResourceType(type="aws:directoryservice/directory:Directory")
public class Directory extends com.pulumi.resources.CustomResource {
    /**
     * The access URL for the directory, such as `http://alias.awsapps.com`.
     * 
     */
    @Export(name="accessUrl", refs={String.class}, tree="[0]")
    private Output<String> accessUrl;

    /**
     * @return The access URL for the directory, such as `http://alias.awsapps.com`.
     * 
     */
    public Output<String> accessUrl() {
        return this.accessUrl;
    }
    /**
     * The alias for the directory (must be unique amongst all aliases in AWS). Required for `enable_sso`.
     * 
     */
    @Export(name="alias", refs={String.class}, tree="[0]")
    private Output<String> alias;

    /**
     * @return The alias for the directory (must be unique amongst all aliases in AWS). Required for `enable_sso`.
     * 
     */
    public Output<String> alias() {
        return this.alias;
    }
    /**
     * Connector related information about the directory. Fields documented below.
     * 
     */
    @Export(name="connectSettings", refs={DirectoryConnectSettings.class}, tree="[0]")
    private Output</* @Nullable */ DirectoryConnectSettings> connectSettings;

    /**
     * @return Connector related information about the directory. Fields documented below.
     * 
     */
    public Output<Optional<DirectoryConnectSettings>> connectSettings() {
        return Codegen.optional(this.connectSettings);
    }
    /**
     * A textual description for the directory.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A textual description for the directory.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The number of domain controllers desired in the directory. Minimum value of `2`. Scaling of domain controllers is only supported for `MicrosoftAD` directories.
     * 
     */
    @Export(name="desiredNumberOfDomainControllers", refs={Integer.class}, tree="[0]")
    private Output<Integer> desiredNumberOfDomainControllers;

    /**
     * @return The number of domain controllers desired in the directory. Minimum value of `2`. Scaling of domain controllers is only supported for `MicrosoftAD` directories.
     * 
     */
    public Output<Integer> desiredNumberOfDomainControllers() {
        return this.desiredNumberOfDomainControllers;
    }
    /**
     * A list of IP addresses of the DNS servers for the directory or connector.
     * 
     */
    @Export(name="dnsIpAddresses", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> dnsIpAddresses;

    /**
     * @return A list of IP addresses of the DNS servers for the directory or connector.
     * 
     */
    public Output<List<String>> dnsIpAddresses() {
        return this.dnsIpAddresses;
    }
    /**
     * The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise`.
     * 
     */
    @Export(name="edition", refs={String.class}, tree="[0]")
    private Output<String> edition;

    /**
     * @return The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise`.
     * 
     */
    public Output<String> edition() {
        return this.edition;
    }
    /**
     * Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
     * 
     */
    @Export(name="enableSso", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableSso;

    /**
     * @return Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> enableSso() {
        return Codegen.optional(this.enableSso);
    }
    /**
     * The fully qualified name for the directory, such as `corp.example.com`
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The fully qualified name for the directory, such as `corp.example.com`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The password for the directory administrator or connector user.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output<String> password;

    /**
     * @return The password for the directory administrator or connector user.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * The ID of the security group created by the directory.
     * 
     */
    @Export(name="securityGroupId", refs={String.class}, tree="[0]")
    private Output<String> securityGroupId;

    /**
     * @return The ID of the security group created by the directory.
     * 
     */
    public Output<String> securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * The short name of the directory, such as `CORP`.
     * 
     */
    @Export(name="shortName", refs={String.class}, tree="[0]")
    private Output<String> shortName;

    /**
     * @return The short name of the directory, such as `CORP`.
     * 
     */
    public Output<String> shortName() {
        return this.shortName;
    }
    /**
     * (For `SimpleAD` and `ADConnector` types) The size of the directory (`Small` or `Large` are accepted values). `Large` by default.
     * 
     */
    @Export(name="size", refs={String.class}, tree="[0]")
    private Output<String> size;

    /**
     * @return (For `SimpleAD` and `ADConnector` types) The size of the directory (`Small` or `Large` are accepted values). `Large` by default.
     * 
     */
    public Output<String> size() {
        return this.size;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
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
     * The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * VPC related information about the directory. Fields documented below.
     * 
     */
    @Export(name="vpcSettings", refs={DirectoryVpcSettings.class}, tree="[0]")
    private Output</* @Nullable */ DirectoryVpcSettings> vpcSettings;

    /**
     * @return VPC related information about the directory. Fields documented below.
     * 
     */
    public Output<Optional<DirectoryVpcSettings>> vpcSettings() {
        return Codegen.optional(this.vpcSettings);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Directory(String name) {
        this(name, DirectoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Directory(String name, DirectoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Directory(String name, DirectoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directoryservice/directory:Directory", name, args == null ? DirectoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Directory(String name, Output<String> id, @Nullable DirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directoryservice/directory:Directory", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password"
            ))
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
    public static Directory get(String name, Output<String> id, @Nullable DirectoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Directory(name, id, state, options);
    }
}
