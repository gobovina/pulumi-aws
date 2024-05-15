// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datazone;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.datazone.DomainArgs;
import com.pulumi.aws.datazone.inputs.DomainState;
import com.pulumi.aws.datazone.outputs.DomainSingleSignOn;
import com.pulumi.aws.datazone.outputs.DomainTimeouts;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS DataZone Domain.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.iam.inputs.RoleInlinePolicyArgs;
 * import com.pulumi.aws.datazone.Domain;
 * import com.pulumi.aws.datazone.DomainArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var domainExecutionRole = new Role("domainExecutionRole", RoleArgs.builder()        
 *             .name("my_domain_execution_role")
 *             .assumeRolePolicy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty("Version", "2012-10-17"),
 *                     jsonProperty("Statement", jsonArray(
 *                         jsonObject(
 *                             jsonProperty("Action", jsonArray(
 *                                 "sts:AssumeRole", 
 *                                 "sts:TagSession"
 *                             )),
 *                             jsonProperty("Effect", "Allow"),
 *                             jsonProperty("Principal", jsonObject(
 *                                 jsonProperty("Service", "datazone.amazonaws.com")
 *                             ))
 *                         ), 
 *                         jsonObject(
 *                             jsonProperty("Action", jsonArray(
 *                                 "sts:AssumeRole", 
 *                                 "sts:TagSession"
 *                             )),
 *                             jsonProperty("Effect", "Allow"),
 *                             jsonProperty("Principal", jsonObject(
 *                                 jsonProperty("Service", "cloudformation.amazonaws.com")
 *                             ))
 *                         )
 *                     ))
 *                 )))
 *             .inlinePolicies(RoleInlinePolicyArgs.builder()
 *                 .name("domain_execution_policy")
 *                 .policy(serializeJson(
 *                     jsonObject(
 *                         jsonProperty("Version", "2012-10-17"),
 *                         jsonProperty("Statement", jsonArray(jsonObject(
 *                             jsonProperty("Action", jsonArray(
 *                                 "datazone:*", 
 *                                 "ram:*", 
 *                                 "sso:*", 
 *                                 "kms:*"
 *                             )),
 *                             jsonProperty("Effect", "Allow"),
 *                             jsonProperty("Resource", "*")
 *                         )))
 *                     )))
 *                 .build())
 *             .build());
 * 
 *         var example = new Domain("example", DomainArgs.builder()        
 *             .name("example")
 *             .domainExecutionRole(domainExecutionRole.arn())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import DataZone Domain using the `domain_id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:datazone/domain:Domain example domain-id-12345678
 * ```
 * 
 */
@ResourceType(type="aws:datazone/domain:Domain")
public class Domain extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the Domain.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the Domain.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Description of the Domain.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the Domain.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * ARN of the role used by DataZone to configure the Domain.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="domainExecutionRole", refs={String.class}, tree="[0]")
    private Output<String> domainExecutionRole;

    /**
     * @return ARN of the role used by DataZone to configure the Domain.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> domainExecutionRole() {
        return this.domainExecutionRole;
    }
    /**
     * ARN of the KMS key used to encrypt the Amazon DataZone domain, metadata and reporting data.
     * 
     */
    @Export(name="kmsKeyIdentifier", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kmsKeyIdentifier;

    /**
     * @return ARN of the KMS key used to encrypt the Amazon DataZone domain, metadata and reporting data.
     * 
     */
    public Output<Optional<String>> kmsKeyIdentifier() {
        return Codegen.optional(this.kmsKeyIdentifier);
    }
    /**
     * Name of the Domain.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Domain.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * URL of the data portal for the Domain.
     * 
     */
    @Export(name="portalUrl", refs={String.class}, tree="[0]")
    private Output<String> portalUrl;

    /**
     * @return URL of the data portal for the Domain.
     * 
     */
    public Output<String> portalUrl() {
        return this.portalUrl;
    }
    /**
     * Single sign on options, used to [enable AWS IAM Identity Center](https://docs.aws.amazon.com/datazone/latest/userguide/enable-IAM-identity-center-for-datazone.html) for DataZone.
     * 
     */
    @Export(name="singleSignOn", refs={DomainSingleSignOn.class}, tree="[0]")
    private Output</* @Nullable */ DomainSingleSignOn> singleSignOn;

    /**
     * @return Single sign on options, used to [enable AWS IAM Identity Center](https://docs.aws.amazon.com/datazone/latest/userguide/enable-IAM-identity-center-for-datazone.html) for DataZone.
     * 
     */
    public Output<Optional<DomainSingleSignOn>> singleSignOn() {
        return Codegen.optional(this.singleSignOn);
    }
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    @Export(name="timeouts", refs={DomainTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ DomainTimeouts> timeouts;

    public Output<Optional<DomainTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, DomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datazone/domain:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datazone/domain:Domain", name, state, makeResourceOptions(options, id));
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
    public static Domain get(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, state, options);
    }
}
