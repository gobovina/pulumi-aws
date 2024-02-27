// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.datasync.LocationHdfsArgs;
import com.pulumi.aws.datasync.inputs.LocationHdfsState;
import com.pulumi.aws.datasync.outputs.LocationHdfsNameNode;
import com.pulumi.aws.datasync.outputs.LocationHdfsQopConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an HDFS Location within AWS DataSync.
 * 
 * &gt; **NOTE:** The DataSync Agents must be available before creating this resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.datasync.LocationHdfs;
 * import com.pulumi.aws.datasync.LocationHdfsArgs;
 * import com.pulumi.aws.datasync.inputs.LocationHdfsNameNodeArgs;
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
 *         var example = new LocationHdfs(&#34;example&#34;, LocationHdfsArgs.builder()        
 *             .agentArns(aws_datasync_agent.example().arn())
 *             .authenticationType(&#34;SIMPLE&#34;)
 *             .simpleUser(&#34;example&#34;)
 *             .nameNodes(LocationHdfsNameNodeArgs.builder()
 *                 .hostname(aws_instance.example().private_dns())
 *                 .port(80)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_datasync_location_hdfs` using the Amazon Resource Name (ARN). For example:
 * 
 * ```sh
 *  $ pulumi import aws:datasync/locationHdfs:LocationHdfs example arn:aws:datasync:us-east-1:123456789012:location/loc-12345678901234567
 * ```
 * 
 */
@ResourceType(type="aws:datasync/locationHdfs:LocationHdfs")
public class LocationHdfs extends com.pulumi.resources.CustomResource {
    /**
     * A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    @Export(name="agentArns", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> agentArns;

    /**
     * @return A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    public Output<List<String>> agentArns() {
        return this.agentArns;
    }
    /**
     * Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The type of authentication used to determine the identity of the user. Valid values are `SIMPLE` and `KERBEROS`.
     * 
     */
    @Export(name="authenticationType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authenticationType;

    /**
     * @return The type of authentication used to determine the identity of the user. Valid values are `SIMPLE` and `KERBEROS`.
     * 
     */
    public Output<Optional<String>> authenticationType() {
        return Codegen.optional(this.authenticationType);
    }
    /**
     * The size of data blocks to write into the HDFS cluster. The block size must be a multiple of 512 bytes. The default block size is 128 mebibytes (MiB).
     * 
     */
    @Export(name="blockSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> blockSize;

    /**
     * @return The size of data blocks to write into the HDFS cluster. The block size must be a multiple of 512 bytes. The default block size is 128 mebibytes (MiB).
     * 
     */
    public Output<Optional<Integer>> blockSize() {
        return Codegen.optional(this.blockSize);
    }
    /**
     * The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal and the encrypted keys. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @Export(name="kerberosKeytab", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kerberosKeytab;

    /**
     * @return The Kerberos key table (keytab) that contains mappings between the defined Kerberos principal and the encrypted keys. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    public Output<Optional<String>> kerberosKeytab() {
        return Codegen.optional(this.kerberosKeytab);
    }
    /**
     * The krb5.conf file that contains the Kerberos configuration information. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @Export(name="kerberosKrb5Conf", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kerberosKrb5Conf;

    /**
     * @return The krb5.conf file that contains the Kerberos configuration information. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    public Output<Optional<String>> kerberosKrb5Conf() {
        return Codegen.optional(this.kerberosKrb5Conf);
    }
    /**
     * The Kerberos principal with access to the files and folders on the HDFS cluster. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @Export(name="kerberosPrincipal", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kerberosPrincipal;

    /**
     * @return The Kerberos principal with access to the files and folders on the HDFS cluster. If `KERBEROS` is specified for `authentication_type`, this parameter is required.
     * 
     */
    public Output<Optional<String>> kerberosPrincipal() {
        return Codegen.optional(this.kerberosPrincipal);
    }
    /**
     * The URI of the HDFS cluster&#39;s Key Management Server (KMS).
     * 
     */
    @Export(name="kmsKeyProviderUri", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kmsKeyProviderUri;

    /**
     * @return The URI of the HDFS cluster&#39;s Key Management Server (KMS).
     * 
     */
    public Output<Optional<String>> kmsKeyProviderUri() {
        return Codegen.optional(this.kmsKeyProviderUri);
    }
    /**
     * The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing, and renaming files and directories. The NameNode contains the information to map blocks of data to the DataNodes. You can use only one NameNode. See configuration below.
     * 
     */
    @Export(name="nameNodes", refs={List.class,LocationHdfsNameNode.class}, tree="[0,1]")
    private Output<List<LocationHdfsNameNode>> nameNodes;

    /**
     * @return The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing, and renaming files and directories. The NameNode contains the information to map blocks of data to the DataNodes. You can use only one NameNode. See configuration below.
     * 
     */
    public Output<List<LocationHdfsNameNode>> nameNodes() {
        return this.nameNodes;
    }
    /**
     * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster. If `qop_configuration` isn&#39;t specified, `rpc_protection` and `data_transfer_protection` default to `PRIVACY`. If you set RpcProtection or DataTransferProtection, the other parameter assumes the same value.  See configuration below.
     * 
     */
    @Export(name="qopConfiguration", refs={LocationHdfsQopConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ LocationHdfsQopConfiguration> qopConfiguration;

    /**
     * @return The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster. If `qop_configuration` isn&#39;t specified, `rpc_protection` and `data_transfer_protection` default to `PRIVACY`. If you set RpcProtection or DataTransferProtection, the other parameter assumes the same value.  See configuration below.
     * 
     */
    public Output<Optional<LocationHdfsQopConfiguration>> qopConfiguration() {
        return Codegen.optional(this.qopConfiguration);
    }
    /**
     * The number of DataNodes to replicate the data to when writing to the HDFS cluster. By default, data is replicated to three DataNodes.
     * 
     */
    @Export(name="replicationFactor", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> replicationFactor;

    /**
     * @return The number of DataNodes to replicate the data to when writing to the HDFS cluster. By default, data is replicated to three DataNodes.
     * 
     */
    public Output<Optional<Integer>> replicationFactor() {
        return Codegen.optional(this.replicationFactor);
    }
    /**
     * The user name used to identify the client on the host operating system. If `SIMPLE` is specified for `authentication_type`, this parameter is required.
     * 
     */
    @Export(name="simpleUser", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> simpleUser;

    /**
     * @return The user name used to identify the client on the host operating system. If `SIMPLE` is specified for `authentication_type`, this parameter is required.
     * 
     */
    public Output<Optional<String>> simpleUser() {
        return Codegen.optional(this.simpleUser);
    }
    /**
     * A subdirectory in the HDFS cluster. This subdirectory is used to read data from or write data to the HDFS cluster. If the subdirectory isn&#39;t specified, it will default to /.
     * 
     */
    @Export(name="subdirectory", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subdirectory;

    /**
     * @return A subdirectory in the HDFS cluster. This subdirectory is used to read data from or write data to the HDFS cluster. If the subdirectory isn&#39;t specified, it will default to /.
     * 
     */
    public Output<Optional<String>> subdirectory() {
        return Codegen.optional(this.subdirectory);
    }
    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @Export(name="uri", refs={String.class}, tree="[0]")
    private Output<String> uri;

    public Output<String> uri() {
        return this.uri;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LocationHdfs(String name) {
        this(name, LocationHdfsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocationHdfs(String name, LocationHdfsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocationHdfs(String name, LocationHdfsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/locationHdfs:LocationHdfs", name, args == null ? LocationHdfsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LocationHdfs(String name, Output<String> id, @Nullable LocationHdfsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/locationHdfs:LocationHdfs", name, state, makeResourceOptions(options, id));
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
    public static LocationHdfs get(String name, Output<String> id, @Nullable LocationHdfsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LocationHdfs(name, id, state, options);
    }
}
