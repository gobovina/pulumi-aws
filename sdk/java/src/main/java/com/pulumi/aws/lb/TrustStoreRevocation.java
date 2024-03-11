// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lb.TrustStoreRevocationArgs;
import com.pulumi.aws.lb.inputs.TrustStoreRevocationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ELBv2 Trust Store Revocation for use with Application Load Balancer Listener resources.
 * 
 * ## Example Usage
 * 
 * ### Trust Store With Revocations
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lb.TrustStore;
 * import com.pulumi.aws.lb.TrustStoreArgs;
 * import com.pulumi.aws.lb.TrustStoreRevocation;
 * import com.pulumi.aws.lb.TrustStoreRevocationArgs;
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
 *         var test = new TrustStore(&#34;test&#34;, TrustStoreArgs.builder()        
 *             .name(&#34;tf-example-lb-ts&#34;)
 *             .caCertificatesBundleS3Bucket(&#34;...&#34;)
 *             .caCertificatesBundleS3Key(&#34;...&#34;)
 *             .build());
 * 
 *         var testTrustStoreRevocation = new TrustStoreRevocation(&#34;testTrustStoreRevocation&#34;, TrustStoreRevocationArgs.builder()        
 *             .trustStoreArn(test.arn())
 *             .revocationsS3Bucket(&#34;...&#34;)
 *             .revocationsS3Key(&#34;...&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Trust Store Revocations using their ARN. For example:
 * 
 * ```sh
 * $ pulumi import aws:lb/trustStoreRevocation:TrustStoreRevocation example arn:aws:elasticloadbalancing:us-west-2:187416307283:truststore/my-trust-store/20cfe21448b66314,6
 * ```
 * 
 */
@ResourceType(type="aws:lb/trustStoreRevocation:TrustStoreRevocation")
public class TrustStoreRevocation extends com.pulumi.resources.CustomResource {
    /**
     * AWS assigned RevocationId, (number).
     * 
     */
    @Export(name="revocationId", refs={Integer.class}, tree="[0]")
    private Output<Integer> revocationId;

    /**
     * @return AWS assigned RevocationId, (number).
     * 
     */
    public Output<Integer> revocationId() {
        return this.revocationId;
    }
    /**
     * S3 Bucket name holding the client certificate CA bundle.
     * 
     */
    @Export(name="revocationsS3Bucket", refs={String.class}, tree="[0]")
    private Output<String> revocationsS3Bucket;

    /**
     * @return S3 Bucket name holding the client certificate CA bundle.
     * 
     */
    public Output<String> revocationsS3Bucket() {
        return this.revocationsS3Bucket;
    }
    /**
     * S3 object key holding the client certificate CA bundle.
     * 
     */
    @Export(name="revocationsS3Key", refs={String.class}, tree="[0]")
    private Output<String> revocationsS3Key;

    /**
     * @return S3 object key holding the client certificate CA bundle.
     * 
     */
    public Output<String> revocationsS3Key() {
        return this.revocationsS3Key;
    }
    /**
     * Version Id of CA bundle S3 bucket object, if versioned, defaults to latest if omitted.
     * 
     */
    @Export(name="revocationsS3ObjectVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> revocationsS3ObjectVersion;

    /**
     * @return Version Id of CA bundle S3 bucket object, if versioned, defaults to latest if omitted.
     * 
     */
    public Output<Optional<String>> revocationsS3ObjectVersion() {
        return Codegen.optional(this.revocationsS3ObjectVersion);
    }
    /**
     * Trust Store ARN.
     * 
     */
    @Export(name="trustStoreArn", refs={String.class}, tree="[0]")
    private Output<String> trustStoreArn;

    /**
     * @return Trust Store ARN.
     * 
     */
    public Output<String> trustStoreArn() {
        return this.trustStoreArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TrustStoreRevocation(String name) {
        this(name, TrustStoreRevocationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TrustStoreRevocation(String name, TrustStoreRevocationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TrustStoreRevocation(String name, TrustStoreRevocationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lb/trustStoreRevocation:TrustStoreRevocation", name, args == null ? TrustStoreRevocationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TrustStoreRevocation(String name, Output<String> id, @Nullable TrustStoreRevocationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lb/trustStoreRevocation:TrustStoreRevocation", name, state, makeResourceOptions(options, id));
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
    public static TrustStoreRevocation get(String name, Output<String> id, @Nullable TrustStoreRevocationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TrustStoreRevocation(name, id, state, options);
    }
}
