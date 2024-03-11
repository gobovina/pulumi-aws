// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.securityhub.InviteAccepterArgs;
import com.pulumi.aws.securityhub.inputs.InviteAccepterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * &gt; **Note:** AWS accounts can only be associated with a single Security Hub master account. Destroying this resource will disassociate the member account from the master account.
 * 
 * Accepts a Security Hub invitation.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.securityhub.Account;
 * import com.pulumi.aws.securityhub.Member;
 * import com.pulumi.aws.securityhub.MemberArgs;
 * import com.pulumi.aws.securityhub.InviteAccepter;
 * import com.pulumi.aws.securityhub.InviteAccepterArgs;
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
 *         var example = new Account(&#34;example&#34;);
 * 
 *         var exampleMember = new Member(&#34;exampleMember&#34;, MemberArgs.builder()        
 *             .accountId(&#34;123456789012&#34;)
 *             .email(&#34;example@example.com&#34;)
 *             .invite(true)
 *             .build());
 * 
 *         var invitee = new Account(&#34;invitee&#34;);
 * 
 *         var inviteeInviteAccepter = new InviteAccepter(&#34;inviteeInviteAccepter&#34;, InviteAccepterArgs.builder()        
 *             .masterId(exampleMember.masterId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Security Hub invite acceptance using the account ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:securityhub/inviteAccepter:InviteAccepter example 123456789012
 * ```
 * 
 */
@ResourceType(type="aws:securityhub/inviteAccepter:InviteAccepter")
public class InviteAccepter extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the invitation.
     * 
     */
    @Export(name="invitationId", refs={String.class}, tree="[0]")
    private Output<String> invitationId;

    /**
     * @return The ID of the invitation.
     * 
     */
    public Output<String> invitationId() {
        return this.invitationId;
    }
    /**
     * The account ID of the master Security Hub account whose invitation you&#39;re accepting.
     * 
     */
    @Export(name="masterId", refs={String.class}, tree="[0]")
    private Output<String> masterId;

    /**
     * @return The account ID of the master Security Hub account whose invitation you&#39;re accepting.
     * 
     */
    public Output<String> masterId() {
        return this.masterId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InviteAccepter(String name) {
        this(name, InviteAccepterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InviteAccepter(String name, InviteAccepterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InviteAccepter(String name, InviteAccepterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/inviteAccepter:InviteAccepter", name, args == null ? InviteAccepterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InviteAccepter(String name, Output<String> id, @Nullable InviteAccepterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/inviteAccepter:InviteAccepter", name, state, makeResourceOptions(options, id));
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
    public static InviteAccepter get(String name, Output<String> id, @Nullable InviteAccepterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InviteAccepter(name, id, state, options);
    }
}
