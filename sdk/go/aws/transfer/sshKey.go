// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package transfer

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a AWS Transfer User SSH Key resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/transfer"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleServer, err := transfer.NewServer(ctx, "exampleServer", &transfer.ServerArgs{
//				IdentityProviderType: pulumi.String("SERVICE_MANAGED"),
//				Tags: pulumi.StringMap{
//					"NAME": pulumi.String("tf-acc-test-transfer-server"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			assumeRole, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Effect: pulumi.StringRef("Allow"),
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "Service",
//								Identifiers: []string{
//									"transfer.amazonaws.com",
//								},
//							},
//						},
//						Actions: []string{
//							"sts:AssumeRole",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			exampleRole, err := iam.NewRole(ctx, "exampleRole", &iam.RoleArgs{
//				AssumeRolePolicy: *pulumi.String(assumeRole.Json),
//			})
//			if err != nil {
//				return err
//			}
//			exampleUser, err := transfer.NewUser(ctx, "exampleUser", &transfer.UserArgs{
//				ServerId: exampleServer.ID(),
//				UserName: pulumi.String("tftestuser"),
//				Role:     exampleRole.Arn,
//				Tags: pulumi.StringMap{
//					"NAME": pulumi.String("tftestuser"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = transfer.NewSshKey(ctx, "exampleSshKey", &transfer.SshKeyArgs{
//				ServerId: exampleServer.ID(),
//				UserName: exampleUser.UserName,
//				Body:     pulumi.String("... SSH key ..."),
//			})
//			if err != nil {
//				return err
//			}
//			examplePolicyDocument, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Sid:    pulumi.StringRef("AllowFullAccesstoS3"),
//						Effect: pulumi.StringRef("Allow"),
//						Actions: []string{
//							"s3:*",
//						},
//						Resources: []string{
//							"*",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = iam.NewRolePolicy(ctx, "exampleRolePolicy", &iam.RolePolicyArgs{
//				Role:   exampleRole.ID(),
//				Policy: *pulumi.String(examplePolicyDocument.Json),
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
// ## Import
//
// Using `pulumi import`, import Transfer SSH Public Key using the `server_id` and `user_name` and `ssh_public_key_id` separated by `/`. For example:
//
// ```sh
//
//	$ pulumi import aws:transfer/sshKey:SshKey bar s-12345678/test-username/key-12345
//
// ```
type SshKey struct {
	pulumi.CustomResourceState

	// The public key portion of an SSH key pair.
	Body pulumi.StringOutput `pulumi:"body"`
	// The Server ID of the Transfer Server (e.g., `s-12345678`)
	ServerId pulumi.StringOutput `pulumi:"serverId"`
	// The name of the user account that is assigned to one or more servers.
	UserName pulumi.StringOutput `pulumi:"userName"`
}

// NewSshKey registers a new resource with the given unique name, arguments, and options.
func NewSshKey(ctx *pulumi.Context,
	name string, args *SshKeyArgs, opts ...pulumi.ResourceOption) (*SshKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Body == nil {
		return nil, errors.New("invalid value for required argument 'Body'")
	}
	if args.ServerId == nil {
		return nil, errors.New("invalid value for required argument 'ServerId'")
	}
	if args.UserName == nil {
		return nil, errors.New("invalid value for required argument 'UserName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SshKey
	err := ctx.RegisterResource("aws:transfer/sshKey:SshKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSshKey gets an existing SshKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSshKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SshKeyState, opts ...pulumi.ResourceOption) (*SshKey, error) {
	var resource SshKey
	err := ctx.ReadResource("aws:transfer/sshKey:SshKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SshKey resources.
type sshKeyState struct {
	// The public key portion of an SSH key pair.
	Body *string `pulumi:"body"`
	// The Server ID of the Transfer Server (e.g., `s-12345678`)
	ServerId *string `pulumi:"serverId"`
	// The name of the user account that is assigned to one or more servers.
	UserName *string `pulumi:"userName"`
}

type SshKeyState struct {
	// The public key portion of an SSH key pair.
	Body pulumi.StringPtrInput
	// The Server ID of the Transfer Server (e.g., `s-12345678`)
	ServerId pulumi.StringPtrInput
	// The name of the user account that is assigned to one or more servers.
	UserName pulumi.StringPtrInput
}

func (SshKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*sshKeyState)(nil)).Elem()
}

type sshKeyArgs struct {
	// The public key portion of an SSH key pair.
	Body string `pulumi:"body"`
	// The Server ID of the Transfer Server (e.g., `s-12345678`)
	ServerId string `pulumi:"serverId"`
	// The name of the user account that is assigned to one or more servers.
	UserName string `pulumi:"userName"`
}

// The set of arguments for constructing a SshKey resource.
type SshKeyArgs struct {
	// The public key portion of an SSH key pair.
	Body pulumi.StringInput
	// The Server ID of the Transfer Server (e.g., `s-12345678`)
	ServerId pulumi.StringInput
	// The name of the user account that is assigned to one or more servers.
	UserName pulumi.StringInput
}

func (SshKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sshKeyArgs)(nil)).Elem()
}

type SshKeyInput interface {
	pulumi.Input

	ToSshKeyOutput() SshKeyOutput
	ToSshKeyOutputWithContext(ctx context.Context) SshKeyOutput
}

func (*SshKey) ElementType() reflect.Type {
	return reflect.TypeOf((**SshKey)(nil)).Elem()
}

func (i *SshKey) ToSshKeyOutput() SshKeyOutput {
	return i.ToSshKeyOutputWithContext(context.Background())
}

func (i *SshKey) ToSshKeyOutputWithContext(ctx context.Context) SshKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshKeyOutput)
}

// SshKeyArrayInput is an input type that accepts SshKeyArray and SshKeyArrayOutput values.
// You can construct a concrete instance of `SshKeyArrayInput` via:
//
//	SshKeyArray{ SshKeyArgs{...} }
type SshKeyArrayInput interface {
	pulumi.Input

	ToSshKeyArrayOutput() SshKeyArrayOutput
	ToSshKeyArrayOutputWithContext(context.Context) SshKeyArrayOutput
}

type SshKeyArray []SshKeyInput

func (SshKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SshKey)(nil)).Elem()
}

func (i SshKeyArray) ToSshKeyArrayOutput() SshKeyArrayOutput {
	return i.ToSshKeyArrayOutputWithContext(context.Background())
}

func (i SshKeyArray) ToSshKeyArrayOutputWithContext(ctx context.Context) SshKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshKeyArrayOutput)
}

// SshKeyMapInput is an input type that accepts SshKeyMap and SshKeyMapOutput values.
// You can construct a concrete instance of `SshKeyMapInput` via:
//
//	SshKeyMap{ "key": SshKeyArgs{...} }
type SshKeyMapInput interface {
	pulumi.Input

	ToSshKeyMapOutput() SshKeyMapOutput
	ToSshKeyMapOutputWithContext(context.Context) SshKeyMapOutput
}

type SshKeyMap map[string]SshKeyInput

func (SshKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SshKey)(nil)).Elem()
}

func (i SshKeyMap) ToSshKeyMapOutput() SshKeyMapOutput {
	return i.ToSshKeyMapOutputWithContext(context.Background())
}

func (i SshKeyMap) ToSshKeyMapOutputWithContext(ctx context.Context) SshKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshKeyMapOutput)
}

type SshKeyOutput struct{ *pulumi.OutputState }

func (SshKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SshKey)(nil)).Elem()
}

func (o SshKeyOutput) ToSshKeyOutput() SshKeyOutput {
	return o
}

func (o SshKeyOutput) ToSshKeyOutputWithContext(ctx context.Context) SshKeyOutput {
	return o
}

// The public key portion of an SSH key pair.
func (o SshKeyOutput) Body() pulumi.StringOutput {
	return o.ApplyT(func(v *SshKey) pulumi.StringOutput { return v.Body }).(pulumi.StringOutput)
}

// The Server ID of the Transfer Server (e.g., `s-12345678`)
func (o SshKeyOutput) ServerId() pulumi.StringOutput {
	return o.ApplyT(func(v *SshKey) pulumi.StringOutput { return v.ServerId }).(pulumi.StringOutput)
}

// The name of the user account that is assigned to one or more servers.
func (o SshKeyOutput) UserName() pulumi.StringOutput {
	return o.ApplyT(func(v *SshKey) pulumi.StringOutput { return v.UserName }).(pulumi.StringOutput)
}

type SshKeyArrayOutput struct{ *pulumi.OutputState }

func (SshKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SshKey)(nil)).Elem()
}

func (o SshKeyArrayOutput) ToSshKeyArrayOutput() SshKeyArrayOutput {
	return o
}

func (o SshKeyArrayOutput) ToSshKeyArrayOutputWithContext(ctx context.Context) SshKeyArrayOutput {
	return o
}

func (o SshKeyArrayOutput) Index(i pulumi.IntInput) SshKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SshKey {
		return vs[0].([]*SshKey)[vs[1].(int)]
	}).(SshKeyOutput)
}

type SshKeyMapOutput struct{ *pulumi.OutputState }

func (SshKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SshKey)(nil)).Elem()
}

func (o SshKeyMapOutput) ToSshKeyMapOutput() SshKeyMapOutput {
	return o
}

func (o SshKeyMapOutput) ToSshKeyMapOutputWithContext(ctx context.Context) SshKeyMapOutput {
	return o
}

func (o SshKeyMapOutput) MapIndex(k pulumi.StringInput) SshKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SshKey {
		return vs[0].(map[string]*SshKey)[vs[1].(string)]
	}).(SshKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SshKeyInput)(nil)).Elem(), &SshKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*SshKeyArrayInput)(nil)).Elem(), SshKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SshKeyMapInput)(nil)).Elem(), SshKeyMap{})
	pulumi.RegisterOutputType(SshKeyOutput{})
	pulumi.RegisterOutputType(SshKeyArrayOutput{})
	pulumi.RegisterOutputType(SshKeyMapOutput{})
}
