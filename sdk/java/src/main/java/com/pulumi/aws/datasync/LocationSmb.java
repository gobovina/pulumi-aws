// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.datasync.LocationSmbArgs;
import com.pulumi.aws.datasync.inputs.LocationSmbState;
import com.pulumi.aws.datasync.outputs.LocationSmbMountOptions;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a SMB Location within AWS DataSync.
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
 * import com.pulumi.aws.datasync.LocationSmb;
 * import com.pulumi.aws.datasync.LocationSmbArgs;
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
 *         var example = new LocationSmb(&#34;example&#34;, LocationSmbArgs.builder()        
 *             .serverHostname(&#34;smb.example.com&#34;)
 *             .subdirectory(&#34;/exported/path&#34;)
 *             .user(&#34;Guest&#34;)
 *             .password(&#34;ANotGreatPassword&#34;)
 *             .agentArns(aws_datasync_agent.example().arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_datasync_location_smb` using the Amazon Resource Name (ARN). For example:
 * 
 * ```sh
 *  $ pulumi import aws:datasync/locationSmb:LocationSmb example arn:aws:datasync:us-east-1:123456789012:location/loc-12345678901234567
 * ```
 * 
 */
@ResourceType(type="aws:datasync/locationSmb:LocationSmb")
public class LocationSmb extends com.pulumi.resources.CustomResource {
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
     * The name of the Windows domain the SMB server belongs to.
     * 
     */
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output<String> domain;

    /**
     * @return The name of the Windows domain the SMB server belongs to.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * Configuration block containing mount options used by DataSync to access the SMB Server. Can be `AUTOMATIC`, `SMB2`, or `SMB3`.
     * 
     */
    @Export(name="mountOptions", refs={LocationSmbMountOptions.class}, tree="[0]")
    private Output</* @Nullable */ LocationSmbMountOptions> mountOptions;

    /**
     * @return Configuration block containing mount options used by DataSync to access the SMB Server. Can be `AUTOMATIC`, `SMB2`, or `SMB3`.
     * 
     */
    public Output<Optional<LocationSmbMountOptions>> mountOptions() {
        return Codegen.optional(this.mountOptions);
    }
    /**
     * The password of the user who can mount the share and has file permissions in the SMB.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output<String> password;

    /**
     * @return The password of the user who can mount the share and has file permissions in the SMB.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * Specifies the IP address or DNS name of the SMB server. The DataSync Agent(s) use this to mount the SMB share.
     * 
     */
    @Export(name="serverHostname", refs={String.class}, tree="[0]")
    private Output<String> serverHostname;

    /**
     * @return Specifies the IP address or DNS name of the SMB server. The DataSync Agent(s) use this to mount the SMB share.
     * 
     */
    public Output<String> serverHostname() {
        return this.serverHostname;
    }
    /**
     * Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
     * 
     */
    @Export(name="subdirectory", refs={String.class}, tree="[0]")
    private Output<String> subdirectory;

    /**
     * @return Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
     * 
     */
    public Output<String> subdirectory() {
        return this.subdirectory;
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
     * The user who can mount the share and has file and folder permissions in the SMB share.
     * 
     */
    @Export(name="user", refs={String.class}, tree="[0]")
    private Output<String> user;

    /**
     * @return The user who can mount the share and has file and folder permissions in the SMB share.
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LocationSmb(String name) {
        this(name, LocationSmbArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocationSmb(String name, LocationSmbArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocationSmb(String name, LocationSmbArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/locationSmb:LocationSmb", name, args == null ? LocationSmbArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LocationSmb(String name, Output<String> id, @Nullable LocationSmbState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/locationSmb:LocationSmb", name, state, makeResourceOptions(options, id));
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
    public static LocationSmb get(String name, Output<String> id, @Nullable LocationSmbState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LocationSmb(name, id, state, options);
    }
}
