// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.signer.SigningProfilePermissionArgs;
import com.pulumi.aws.signer.inputs.SigningProfilePermissionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a Signer Signing Profile Permission. That is, a cross-account permission for a signing profile.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.signer.SigningProfile;
 * import com.pulumi.aws.signer.SigningProfileArgs;
 * import com.pulumi.aws.signer.inputs.SigningProfileSignatureValidityPeriodArgs;
 * import com.pulumi.aws.signer.SigningProfilePermission;
 * import com.pulumi.aws.signer.SigningProfilePermissionArgs;
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
 *         var prodSp = new SigningProfile(&#34;prodSp&#34;, SigningProfileArgs.builder()        
 *             .platformId(&#34;AWSLambda-SHA384-ECDSA&#34;)
 *             .namePrefix(&#34;prod_sp_&#34;)
 *             .signatureValidityPeriod(SigningProfileSignatureValidityPeriodArgs.builder()
 *                 .value(5)
 *                 .type(&#34;YEARS&#34;)
 *                 .build())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;tag1&#34;, &#34;value1&#34;),
 *                 Map.entry(&#34;tag2&#34;, &#34;value2&#34;)
 *             ))
 *             .build());
 * 
 *         var spPermission1 = new SigningProfilePermission(&#34;spPermission1&#34;, SigningProfilePermissionArgs.builder()        
 *             .profileName(prodSp.name())
 *             .action(&#34;signer:StartSigningJob&#34;)
 *             .principal(awsAccount)
 *             .build());
 * 
 *         var spPermission2 = new SigningProfilePermission(&#34;spPermission2&#34;, SigningProfilePermissionArgs.builder()        
 *             .profileName(prodSp.name())
 *             .action(&#34;signer:GetSigningProfile&#34;)
 *             .principal(awsTeamRoleArn)
 *             .statementId(&#34;ProdAccountStartSigningJob_StatementId&#34;)
 *             .build());
 * 
 *         var spPermission3 = new SigningProfilePermission(&#34;spPermission3&#34;, SigningProfilePermissionArgs.builder()        
 *             .profileName(prodSp.name())
 *             .action(&#34;signer:RevokeSignature&#34;)
 *             .principal(&#34;123456789012&#34;)
 *             .profileVersion(prodSp.version())
 *             .statementIdPrefix(&#34;version-permission-&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Signer signing profile permission statements using profile_name/statement_id. For example:
 * 
 * ```sh
 *  $ pulumi import aws:signer/signingProfilePermission:SigningProfilePermission test_signer_signing_profile_permission prod_profile_DdW3Mk1foYL88fajut4mTVFGpuwfd4ACO6ANL0D1uIj7lrn8adK/ProdAccountStartSigningJobStatementId
 * ```
 * 
 */
@ResourceType(type="aws:signer/signingProfilePermission:SigningProfilePermission")
public class SigningProfilePermission extends com.pulumi.resources.CustomResource {
    /**
     * An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, `signer:RevokeSignature`, or `signer:SignPayload`.
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output<String> action;

    /**
     * @return An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, `signer:RevokeSignature`, or `signer:SignPayload`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * The AWS principal to be granted a cross-account permission.
     * 
     */
    @Export(name="principal", refs={String.class}, tree="[0]")
    private Output<String> principal;

    /**
     * @return The AWS principal to be granted a cross-account permission.
     * 
     */
    public Output<String> principal() {
        return this.principal;
    }
    /**
     * Name of the signing profile to add the cross-account permissions.
     * 
     */
    @Export(name="profileName", refs={String.class}, tree="[0]")
    private Output<String> profileName;

    /**
     * @return Name of the signing profile to add the cross-account permissions.
     * 
     */
    public Output<String> profileName() {
        return this.profileName;
    }
    /**
     * The signing profile version that a permission applies to.
     * 
     */
    @Export(name="profileVersion", refs={String.class}, tree="[0]")
    private Output<String> profileVersion;

    /**
     * @return The signing profile version that a permission applies to.
     * 
     */
    public Output<String> profileVersion() {
        return this.profileVersion;
    }
    /**
     * A unique statement identifier. By default generated by the provider.
     * 
     */
    @Export(name="statementId", refs={String.class}, tree="[0]")
    private Output<String> statementId;

    /**
     * @return A unique statement identifier. By default generated by the provider.
     * 
     */
    public Output<String> statementId() {
        return this.statementId;
    }
    /**
     * A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
     * 
     */
    @Export(name="statementIdPrefix", refs={String.class}, tree="[0]")
    private Output<String> statementIdPrefix;

    /**
     * @return A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
     * 
     */
    public Output<String> statementIdPrefix() {
        return this.statementIdPrefix;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SigningProfilePermission(String name) {
        this(name, SigningProfilePermissionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SigningProfilePermission(String name, SigningProfilePermissionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SigningProfilePermission(String name, SigningProfilePermissionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:signer/signingProfilePermission:SigningProfilePermission", name, args == null ? SigningProfilePermissionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SigningProfilePermission(String name, Output<String> id, @Nullable SigningProfilePermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:signer/signingProfilePermission:SigningProfilePermission", name, state, makeResourceOptions(options, id));
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
    public static SigningProfilePermission get(String name, Output<String> id, @Nullable SigningProfilePermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SigningProfilePermission(name, id, state, options);
    }
}
