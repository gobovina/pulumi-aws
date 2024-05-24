// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iam.SshKeyArgs;
import com.pulumi.aws.iam.inputs.SshKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Uploads an SSH public key and associates it with the specified IAM user.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.User;
 * import com.pulumi.aws.iam.UserArgs;
 * import com.pulumi.aws.iam.SshKey;
 * import com.pulumi.aws.iam.SshKeyArgs;
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
 *         var user = new User("user", UserArgs.builder()
 *             .name("test-user")
 *             .path("/")
 *             .build());
 * 
 *         var userSshKey = new SshKey("userSshKey", SshKeyArgs.builder()
 *             .username(user.name())
 *             .encoding("SSH")
 *             .publicKey("ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQD3F6tyPEFEzV0LX3X8BsXdMsQz1x2cEikKDEY0aIj41qgxMCP/iteneqXSIFZBp5vizPvaoIR3Um9xK7PGoW8giupGn+EPuxIA4cDM4vzOqOkiMPhz5XK0whEjkVzTo4+S0puvDZuwIsdiW9mxhJc7tgBNL0cYlWSYVkz4G/fslNfRPW5mYAM49f4fhtxPb5ok4Q2Lg9dPKVHO/Bgeu5woMc7RY0p1ej6D4CKFE6lymSDJpW0YHX/wqE9+cfEauh7xZcG0q9t2ta6F6fmX0agvpFyZo8aFbXeUBr7osSCJNgvavWbM/06niWrOvYX2xwWdhXmXSrbX8ZbabVohBK41 mytest{@literal @}mydomain.com")
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
 * Using `pulumi import`, import SSH public keys using the `username`, `ssh_public_key_id`, and `encoding`. For example:
 * 
 * ```sh
 * $ pulumi import aws:iam/sshKey:SshKey user user:APKAJNCNNJICVN7CFKCA:SSH
 * ```
 * 
 */
@ResourceType(type="aws:iam/sshKey:SshKey")
public class SshKey extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use `SSH`. To retrieve the public key in PEM format, use `PEM`.
     * 
     */
    @Export(name="encoding", refs={String.class}, tree="[0]")
    private Output<String> encoding;

    /**
     * @return Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use `SSH`. To retrieve the public key in PEM format, use `PEM`.
     * 
     */
    public Output<String> encoding() {
        return this.encoding;
    }
    /**
     * The MD5 message digest of the SSH public key.
     * 
     */
    @Export(name="fingerprint", refs={String.class}, tree="[0]")
    private Output<String> fingerprint;

    /**
     * @return The MD5 message digest of the SSH public key.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * The SSH public key. The public key must be encoded in ssh-rsa format or PEM format.
     * 
     */
    @Export(name="publicKey", refs={String.class}, tree="[0]")
    private Output<String> publicKey;

    /**
     * @return The SSH public key. The public key must be encoded in ssh-rsa format or PEM format.
     * 
     */
    public Output<String> publicKey() {
        return this.publicKey;
    }
    /**
     * The unique identifier for the SSH public key.
     * 
     */
    @Export(name="sshPublicKeyId", refs={String.class}, tree="[0]")
    private Output<String> sshPublicKeyId;

    /**
     * @return The unique identifier for the SSH public key.
     * 
     */
    public Output<String> sshPublicKeyId() {
        return this.sshPublicKeyId;
    }
    /**
     * The status to assign to the SSH public key. Active means the key can be used for authentication with an AWS CodeCommit repository. Inactive means the key cannot be used. Default is `active`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status to assign to the SSH public key. Active means the key can be used for authentication with an AWS CodeCommit repository. Inactive means the key cannot be used. Default is `active`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The name of the IAM user to associate the SSH public key with.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return The name of the IAM user to associate the SSH public key with.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SshKey(String name) {
        this(name, SshKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SshKey(String name, SshKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SshKey(String name, SshKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/sshKey:SshKey", name, args == null ? SshKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SshKey(String name, Output<String> id, @Nullable SshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/sshKey:SshKey", name, state, makeResourceOptions(options, id));
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
    public static SshKey get(String name, Output<String> id, @Nullable SshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SshKey(name, id, state, options);
    }
}
