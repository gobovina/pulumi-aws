// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package secretsmanager

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage AWS Secrets Manager secret version including its secret value. To manage secret metadata, see the `secretsmanager.Secret` resource.
//
// > **NOTE:** If the `AWSCURRENT` staging label is present on this version during resource deletion, that label cannot be removed and will be skipped to prevent errors when fully deleting the secret. That label will leave this secret version active even after the resource is deleted from this provider unless the secret itself is deleted. Move the `AWSCURRENT` staging label before or after deleting this resource from this provider to fully trigger version deprecation if necessary.
//
// ## Example Usage
// ### Simple String Value
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/secretsmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := secretsmanager.NewSecretVersion(ctx, "example", &secretsmanager.SecretVersionArgs{
//				SecretId:     pulumi.Any(exampleAwsSecretsmanagerSecret.Id),
//				SecretString: pulumi.String("example-string-to-protect"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Key-Value Pairs
//
// Secrets Manager also accepts key-value pairs in JSON.
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/secretsmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			example := map[string]interface{}{
//				"key1": "value1",
//				"key2": "value2",
//			}
//			if param := cfg.GetObject("example"); param != nil {
//				example = param
//			}
//			tmpJSON0, err := json.Marshal(example)
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = secretsmanager.NewSecretVersion(ctx, "example", &secretsmanager.SecretVersionArgs{
//				SecretId:     pulumi.Any(exampleAwsSecretsmanagerSecret.Id),
//				SecretString: pulumi.String(json0),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// # Reading key-value pairs from JSON back into a native map
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func notImplemented(message string) pulumi.AnyOutput {
//		panic(message)
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ctx.Export("example", notImplemented("jsondecode(aws_secretsmanager_secret_version.example.secret_string)").Key1)
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Using `pulumi import`, import `aws_secretsmanager_secret_version` using the secret ID and version ID. For example:
//
// ```sh
//
//	$ pulumi import aws:secretsmanager/secretVersion:SecretVersion example 'arn:aws:secretsmanager:us-east-1:123456789012:secret:example-123456|xxxxx-xxxxxxx-xxxxxxx-xxxxx'
//
// ```
type SecretVersion struct {
	pulumi.CustomResourceState

	// The ARN of the secret.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secretString is not set. Needs to be encoded to base64.
	SecretBinary pulumi.StringPtrOutput `pulumi:"secretBinary"`
	// Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
	SecretId pulumi.StringOutput `pulumi:"secretId"`
	// Specifies text data that you want to encrypt and store in this version of the secret. This is required if secretBinary is not set.
	SecretString pulumi.StringPtrOutput `pulumi:"secretString"`
	// The unique identifier of the version of the secret.
	VersionId pulumi.StringOutput `pulumi:"versionId"`
	// Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
	//
	// > **NOTE:** If `versionStages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
	VersionStages pulumi.StringArrayOutput `pulumi:"versionStages"`
}

// NewSecretVersion registers a new resource with the given unique name, arguments, and options.
func NewSecretVersion(ctx *pulumi.Context,
	name string, args *SecretVersionArgs, opts ...pulumi.ResourceOption) (*SecretVersion, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.SecretId == nil {
		return nil, errors.New("invalid value for required argument 'SecretId'")
	}
	if args.SecretBinary != nil {
		args.SecretBinary = pulumi.ToSecret(args.SecretBinary).(pulumi.StringPtrInput)
	}
	if args.SecretString != nil {
		args.SecretString = pulumi.ToSecret(args.SecretString).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"secretBinary",
		"secretString",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SecretVersion
	err := ctx.RegisterResource("aws:secretsmanager/secretVersion:SecretVersion", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecretVersion gets an existing SecretVersion resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecretVersion(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecretVersionState, opts ...pulumi.ResourceOption) (*SecretVersion, error) {
	var resource SecretVersion
	err := ctx.ReadResource("aws:secretsmanager/secretVersion:SecretVersion", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecretVersion resources.
type secretVersionState struct {
	// The ARN of the secret.
	Arn *string `pulumi:"arn"`
	// Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secretString is not set. Needs to be encoded to base64.
	SecretBinary *string `pulumi:"secretBinary"`
	// Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
	SecretId *string `pulumi:"secretId"`
	// Specifies text data that you want to encrypt and store in this version of the secret. This is required if secretBinary is not set.
	SecretString *string `pulumi:"secretString"`
	// The unique identifier of the version of the secret.
	VersionId *string `pulumi:"versionId"`
	// Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
	//
	// > **NOTE:** If `versionStages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
	VersionStages []string `pulumi:"versionStages"`
}

type SecretVersionState struct {
	// The ARN of the secret.
	Arn pulumi.StringPtrInput
	// Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secretString is not set. Needs to be encoded to base64.
	SecretBinary pulumi.StringPtrInput
	// Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
	SecretId pulumi.StringPtrInput
	// Specifies text data that you want to encrypt and store in this version of the secret. This is required if secretBinary is not set.
	SecretString pulumi.StringPtrInput
	// The unique identifier of the version of the secret.
	VersionId pulumi.StringPtrInput
	// Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
	//
	// > **NOTE:** If `versionStages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
	VersionStages pulumi.StringArrayInput
}

func (SecretVersionState) ElementType() reflect.Type {
	return reflect.TypeOf((*secretVersionState)(nil)).Elem()
}

type secretVersionArgs struct {
	// Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secretString is not set. Needs to be encoded to base64.
	SecretBinary *string `pulumi:"secretBinary"`
	// Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
	SecretId string `pulumi:"secretId"`
	// Specifies text data that you want to encrypt and store in this version of the secret. This is required if secretBinary is not set.
	SecretString *string `pulumi:"secretString"`
	// Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
	//
	// > **NOTE:** If `versionStages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
	VersionStages []string `pulumi:"versionStages"`
}

// The set of arguments for constructing a SecretVersion resource.
type SecretVersionArgs struct {
	// Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secretString is not set. Needs to be encoded to base64.
	SecretBinary pulumi.StringPtrInput
	// Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
	SecretId pulumi.StringInput
	// Specifies text data that you want to encrypt and store in this version of the secret. This is required if secretBinary is not set.
	SecretString pulumi.StringPtrInput
	// Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
	//
	// > **NOTE:** If `versionStages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
	VersionStages pulumi.StringArrayInput
}

func (SecretVersionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secretVersionArgs)(nil)).Elem()
}

type SecretVersionInput interface {
	pulumi.Input

	ToSecretVersionOutput() SecretVersionOutput
	ToSecretVersionOutputWithContext(ctx context.Context) SecretVersionOutput
}

func (*SecretVersion) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretVersion)(nil)).Elem()
}

func (i *SecretVersion) ToSecretVersionOutput() SecretVersionOutput {
	return i.ToSecretVersionOutputWithContext(context.Background())
}

func (i *SecretVersion) ToSecretVersionOutputWithContext(ctx context.Context) SecretVersionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretVersionOutput)
}

// SecretVersionArrayInput is an input type that accepts SecretVersionArray and SecretVersionArrayOutput values.
// You can construct a concrete instance of `SecretVersionArrayInput` via:
//
//	SecretVersionArray{ SecretVersionArgs{...} }
type SecretVersionArrayInput interface {
	pulumi.Input

	ToSecretVersionArrayOutput() SecretVersionArrayOutput
	ToSecretVersionArrayOutputWithContext(context.Context) SecretVersionArrayOutput
}

type SecretVersionArray []SecretVersionInput

func (SecretVersionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecretVersion)(nil)).Elem()
}

func (i SecretVersionArray) ToSecretVersionArrayOutput() SecretVersionArrayOutput {
	return i.ToSecretVersionArrayOutputWithContext(context.Background())
}

func (i SecretVersionArray) ToSecretVersionArrayOutputWithContext(ctx context.Context) SecretVersionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretVersionArrayOutput)
}

// SecretVersionMapInput is an input type that accepts SecretVersionMap and SecretVersionMapOutput values.
// You can construct a concrete instance of `SecretVersionMapInput` via:
//
//	SecretVersionMap{ "key": SecretVersionArgs{...} }
type SecretVersionMapInput interface {
	pulumi.Input

	ToSecretVersionMapOutput() SecretVersionMapOutput
	ToSecretVersionMapOutputWithContext(context.Context) SecretVersionMapOutput
}

type SecretVersionMap map[string]SecretVersionInput

func (SecretVersionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecretVersion)(nil)).Elem()
}

func (i SecretVersionMap) ToSecretVersionMapOutput() SecretVersionMapOutput {
	return i.ToSecretVersionMapOutputWithContext(context.Background())
}

func (i SecretVersionMap) ToSecretVersionMapOutputWithContext(ctx context.Context) SecretVersionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretVersionMapOutput)
}

type SecretVersionOutput struct{ *pulumi.OutputState }

func (SecretVersionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretVersion)(nil)).Elem()
}

func (o SecretVersionOutput) ToSecretVersionOutput() SecretVersionOutput {
	return o
}

func (o SecretVersionOutput) ToSecretVersionOutputWithContext(ctx context.Context) SecretVersionOutput {
	return o
}

// The ARN of the secret.
func (o SecretVersionOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretVersion) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secretString is not set. Needs to be encoded to base64.
func (o SecretVersionOutput) SecretBinary() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecretVersion) pulumi.StringPtrOutput { return v.SecretBinary }).(pulumi.StringPtrOutput)
}

// Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
func (o SecretVersionOutput) SecretId() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretVersion) pulumi.StringOutput { return v.SecretId }).(pulumi.StringOutput)
}

// Specifies text data that you want to encrypt and store in this version of the secret. This is required if secretBinary is not set.
func (o SecretVersionOutput) SecretString() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecretVersion) pulumi.StringPtrOutput { return v.SecretString }).(pulumi.StringPtrOutput)
}

// The unique identifier of the version of the secret.
func (o SecretVersionOutput) VersionId() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretVersion) pulumi.StringOutput { return v.VersionId }).(pulumi.StringOutput)
}

// Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
//
// > **NOTE:** If `versionStages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
func (o SecretVersionOutput) VersionStages() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecretVersion) pulumi.StringArrayOutput { return v.VersionStages }).(pulumi.StringArrayOutput)
}

type SecretVersionArrayOutput struct{ *pulumi.OutputState }

func (SecretVersionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecretVersion)(nil)).Elem()
}

func (o SecretVersionArrayOutput) ToSecretVersionArrayOutput() SecretVersionArrayOutput {
	return o
}

func (o SecretVersionArrayOutput) ToSecretVersionArrayOutputWithContext(ctx context.Context) SecretVersionArrayOutput {
	return o
}

func (o SecretVersionArrayOutput) Index(i pulumi.IntInput) SecretVersionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecretVersion {
		return vs[0].([]*SecretVersion)[vs[1].(int)]
	}).(SecretVersionOutput)
}

type SecretVersionMapOutput struct{ *pulumi.OutputState }

func (SecretVersionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecretVersion)(nil)).Elem()
}

func (o SecretVersionMapOutput) ToSecretVersionMapOutput() SecretVersionMapOutput {
	return o
}

func (o SecretVersionMapOutput) ToSecretVersionMapOutputWithContext(ctx context.Context) SecretVersionMapOutput {
	return o
}

func (o SecretVersionMapOutput) MapIndex(k pulumi.StringInput) SecretVersionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecretVersion {
		return vs[0].(map[string]*SecretVersion)[vs[1].(string)]
	}).(SecretVersionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecretVersionInput)(nil)).Elem(), &SecretVersion{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretVersionArrayInput)(nil)).Elem(), SecretVersionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretVersionMapInput)(nil)).Elem(), SecretVersionMap{})
	pulumi.RegisterOutputType(SecretVersionOutput{})
	pulumi.RegisterOutputType(SecretVersionArrayOutput{})
	pulumi.RegisterOutputType(SecretVersionMapOutput{})
}
