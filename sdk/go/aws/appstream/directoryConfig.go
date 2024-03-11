// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package appstream

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AppStream Directory Config.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/appstream"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := appstream.NewDirectoryConfig(ctx, "example", &appstream.DirectoryConfigArgs{
//				DirectoryName: pulumi.String("NAME OF DIRECTORY"),
//				OrganizationalUnitDistinguishedNames: pulumi.StringArray{
//					pulumi.String("DISTINGUISHED NAME"),
//				},
//				ServiceAccountCredentials: &appstream.DirectoryConfigServiceAccountCredentialsArgs{
//					AccountName:     pulumi.String("NAME OF ACCOUNT"),
//					AccountPassword: pulumi.String("PASSWORD OF ACCOUNT"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import `aws_appstream_directory_config` using the id. For example:
//
// ```sh
// $ pulumi import aws:appstream/directoryConfig:DirectoryConfig example directoryNameExample
// ```
type DirectoryConfig struct {
	pulumi.CustomResourceState

	// Date and time, in UTC and extended RFC 3339 format, when the directory config was created.
	CreatedTime pulumi.StringOutput `pulumi:"createdTime"`
	// Fully qualified name of the directory.
	DirectoryName pulumi.StringOutput `pulumi:"directoryName"`
	// Distinguished names of the organizational units for computer accounts.
	OrganizationalUnitDistinguishedNames pulumi.StringArrayOutput `pulumi:"organizationalUnitDistinguishedNames"`
	// Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `serviceAccountCredentials` below.
	ServiceAccountCredentials DirectoryConfigServiceAccountCredentialsOutput `pulumi:"serviceAccountCredentials"`
}

// NewDirectoryConfig registers a new resource with the given unique name, arguments, and options.
func NewDirectoryConfig(ctx *pulumi.Context,
	name string, args *DirectoryConfigArgs, opts ...pulumi.ResourceOption) (*DirectoryConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DirectoryName == nil {
		return nil, errors.New("invalid value for required argument 'DirectoryName'")
	}
	if args.OrganizationalUnitDistinguishedNames == nil {
		return nil, errors.New("invalid value for required argument 'OrganizationalUnitDistinguishedNames'")
	}
	if args.ServiceAccountCredentials == nil {
		return nil, errors.New("invalid value for required argument 'ServiceAccountCredentials'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DirectoryConfig
	err := ctx.RegisterResource("aws:appstream/directoryConfig:DirectoryConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDirectoryConfig gets an existing DirectoryConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDirectoryConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DirectoryConfigState, opts ...pulumi.ResourceOption) (*DirectoryConfig, error) {
	var resource DirectoryConfig
	err := ctx.ReadResource("aws:appstream/directoryConfig:DirectoryConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DirectoryConfig resources.
type directoryConfigState struct {
	// Date and time, in UTC and extended RFC 3339 format, when the directory config was created.
	CreatedTime *string `pulumi:"createdTime"`
	// Fully qualified name of the directory.
	DirectoryName *string `pulumi:"directoryName"`
	// Distinguished names of the organizational units for computer accounts.
	OrganizationalUnitDistinguishedNames []string `pulumi:"organizationalUnitDistinguishedNames"`
	// Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `serviceAccountCredentials` below.
	ServiceAccountCredentials *DirectoryConfigServiceAccountCredentials `pulumi:"serviceAccountCredentials"`
}

type DirectoryConfigState struct {
	// Date and time, in UTC and extended RFC 3339 format, when the directory config was created.
	CreatedTime pulumi.StringPtrInput
	// Fully qualified name of the directory.
	DirectoryName pulumi.StringPtrInput
	// Distinguished names of the organizational units for computer accounts.
	OrganizationalUnitDistinguishedNames pulumi.StringArrayInput
	// Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `serviceAccountCredentials` below.
	ServiceAccountCredentials DirectoryConfigServiceAccountCredentialsPtrInput
}

func (DirectoryConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*directoryConfigState)(nil)).Elem()
}

type directoryConfigArgs struct {
	// Fully qualified name of the directory.
	DirectoryName string `pulumi:"directoryName"`
	// Distinguished names of the organizational units for computer accounts.
	OrganizationalUnitDistinguishedNames []string `pulumi:"organizationalUnitDistinguishedNames"`
	// Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `serviceAccountCredentials` below.
	ServiceAccountCredentials DirectoryConfigServiceAccountCredentials `pulumi:"serviceAccountCredentials"`
}

// The set of arguments for constructing a DirectoryConfig resource.
type DirectoryConfigArgs struct {
	// Fully qualified name of the directory.
	DirectoryName pulumi.StringInput
	// Distinguished names of the organizational units for computer accounts.
	OrganizationalUnitDistinguishedNames pulumi.StringArrayInput
	// Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `serviceAccountCredentials` below.
	ServiceAccountCredentials DirectoryConfigServiceAccountCredentialsInput
}

func (DirectoryConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*directoryConfigArgs)(nil)).Elem()
}

type DirectoryConfigInput interface {
	pulumi.Input

	ToDirectoryConfigOutput() DirectoryConfigOutput
	ToDirectoryConfigOutputWithContext(ctx context.Context) DirectoryConfigOutput
}

func (*DirectoryConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**DirectoryConfig)(nil)).Elem()
}

func (i *DirectoryConfig) ToDirectoryConfigOutput() DirectoryConfigOutput {
	return i.ToDirectoryConfigOutputWithContext(context.Background())
}

func (i *DirectoryConfig) ToDirectoryConfigOutputWithContext(ctx context.Context) DirectoryConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DirectoryConfigOutput)
}

// DirectoryConfigArrayInput is an input type that accepts DirectoryConfigArray and DirectoryConfigArrayOutput values.
// You can construct a concrete instance of `DirectoryConfigArrayInput` via:
//
//	DirectoryConfigArray{ DirectoryConfigArgs{...} }
type DirectoryConfigArrayInput interface {
	pulumi.Input

	ToDirectoryConfigArrayOutput() DirectoryConfigArrayOutput
	ToDirectoryConfigArrayOutputWithContext(context.Context) DirectoryConfigArrayOutput
}

type DirectoryConfigArray []DirectoryConfigInput

func (DirectoryConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DirectoryConfig)(nil)).Elem()
}

func (i DirectoryConfigArray) ToDirectoryConfigArrayOutput() DirectoryConfigArrayOutput {
	return i.ToDirectoryConfigArrayOutputWithContext(context.Background())
}

func (i DirectoryConfigArray) ToDirectoryConfigArrayOutputWithContext(ctx context.Context) DirectoryConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DirectoryConfigArrayOutput)
}

// DirectoryConfigMapInput is an input type that accepts DirectoryConfigMap and DirectoryConfigMapOutput values.
// You can construct a concrete instance of `DirectoryConfigMapInput` via:
//
//	DirectoryConfigMap{ "key": DirectoryConfigArgs{...} }
type DirectoryConfigMapInput interface {
	pulumi.Input

	ToDirectoryConfigMapOutput() DirectoryConfigMapOutput
	ToDirectoryConfigMapOutputWithContext(context.Context) DirectoryConfigMapOutput
}

type DirectoryConfigMap map[string]DirectoryConfigInput

func (DirectoryConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DirectoryConfig)(nil)).Elem()
}

func (i DirectoryConfigMap) ToDirectoryConfigMapOutput() DirectoryConfigMapOutput {
	return i.ToDirectoryConfigMapOutputWithContext(context.Background())
}

func (i DirectoryConfigMap) ToDirectoryConfigMapOutputWithContext(ctx context.Context) DirectoryConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DirectoryConfigMapOutput)
}

type DirectoryConfigOutput struct{ *pulumi.OutputState }

func (DirectoryConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DirectoryConfig)(nil)).Elem()
}

func (o DirectoryConfigOutput) ToDirectoryConfigOutput() DirectoryConfigOutput {
	return o
}

func (o DirectoryConfigOutput) ToDirectoryConfigOutputWithContext(ctx context.Context) DirectoryConfigOutput {
	return o
}

// Date and time, in UTC and extended RFC 3339 format, when the directory config was created.
func (o DirectoryConfigOutput) CreatedTime() pulumi.StringOutput {
	return o.ApplyT(func(v *DirectoryConfig) pulumi.StringOutput { return v.CreatedTime }).(pulumi.StringOutput)
}

// Fully qualified name of the directory.
func (o DirectoryConfigOutput) DirectoryName() pulumi.StringOutput {
	return o.ApplyT(func(v *DirectoryConfig) pulumi.StringOutput { return v.DirectoryName }).(pulumi.StringOutput)
}

// Distinguished names of the organizational units for computer accounts.
func (o DirectoryConfigOutput) OrganizationalUnitDistinguishedNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DirectoryConfig) pulumi.StringArrayOutput { return v.OrganizationalUnitDistinguishedNames }).(pulumi.StringArrayOutput)
}

// Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `serviceAccountCredentials` below.
func (o DirectoryConfigOutput) ServiceAccountCredentials() DirectoryConfigServiceAccountCredentialsOutput {
	return o.ApplyT(func(v *DirectoryConfig) DirectoryConfigServiceAccountCredentialsOutput {
		return v.ServiceAccountCredentials
	}).(DirectoryConfigServiceAccountCredentialsOutput)
}

type DirectoryConfigArrayOutput struct{ *pulumi.OutputState }

func (DirectoryConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DirectoryConfig)(nil)).Elem()
}

func (o DirectoryConfigArrayOutput) ToDirectoryConfigArrayOutput() DirectoryConfigArrayOutput {
	return o
}

func (o DirectoryConfigArrayOutput) ToDirectoryConfigArrayOutputWithContext(ctx context.Context) DirectoryConfigArrayOutput {
	return o
}

func (o DirectoryConfigArrayOutput) Index(i pulumi.IntInput) DirectoryConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DirectoryConfig {
		return vs[0].([]*DirectoryConfig)[vs[1].(int)]
	}).(DirectoryConfigOutput)
}

type DirectoryConfigMapOutput struct{ *pulumi.OutputState }

func (DirectoryConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DirectoryConfig)(nil)).Elem()
}

func (o DirectoryConfigMapOutput) ToDirectoryConfigMapOutput() DirectoryConfigMapOutput {
	return o
}

func (o DirectoryConfigMapOutput) ToDirectoryConfigMapOutputWithContext(ctx context.Context) DirectoryConfigMapOutput {
	return o
}

func (o DirectoryConfigMapOutput) MapIndex(k pulumi.StringInput) DirectoryConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DirectoryConfig {
		return vs[0].(map[string]*DirectoryConfig)[vs[1].(string)]
	}).(DirectoryConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DirectoryConfigInput)(nil)).Elem(), &DirectoryConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*DirectoryConfigArrayInput)(nil)).Elem(), DirectoryConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DirectoryConfigMapInput)(nil)).Elem(), DirectoryConfigMap{})
	pulumi.RegisterOutputType(DirectoryConfigOutput{})
	pulumi.RegisterOutputType(DirectoryConfigArrayOutput{})
	pulumi.RegisterOutputType(DirectoryConfigMapOutput{})
}
