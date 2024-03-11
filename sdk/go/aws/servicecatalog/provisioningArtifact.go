// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package servicecatalog

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Service Catalog Provisioning Artifact for a specified product.
//
// > A "provisioning artifact" is also referred to as a "version."
//
// > **NOTE:** You cannot create a provisioning artifact for a product that was shared with you.
//
// > **NOTE:** The user or role that use this resource must have the `cloudformation:GetTemplate` IAM policy permission. This policy permission is required when using the `templatePhysicalId` argument.
//
// ## Example Usage
//
// ### Basic Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/servicecatalog"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := servicecatalog.NewProvisioningArtifact(ctx, "example", &servicecatalog.ProvisioningArtifactArgs{
//				Name:        pulumi.String("example"),
//				ProductId:   pulumi.Any(exampleAwsServicecatalogProduct.Id),
//				Type:        pulumi.String("CLOUD_FORMATION_TEMPLATE"),
//				TemplateUrl: pulumi.String(fmt.Sprintf("https://%v/%v", exampleAwsS3Bucket.BucketRegionalDomainName, exampleAwsS3Object.Key)),
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
// Using `pulumi import`, import `aws_servicecatalog_provisioning_artifact` using the provisioning artifact ID and product ID separated by a colon. For example:
//
// ```sh
// $ pulumi import aws:servicecatalog/provisioningArtifact:ProvisioningArtifact example pa-ij2b6lusy6dec:prod-el3an0rma3
// ```
type ProvisioningArtifact struct {
	pulumi.CustomResourceState

	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
	AcceptLanguage pulumi.StringPtrOutput `pulumi:"acceptLanguage"`
	// Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
	Active pulumi.BoolPtrOutput `pulumi:"active"`
	// Time when the provisioning artifact was created.
	CreatedTime pulumi.StringOutput `pulumi:"createdTime"`
	// Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
	Description pulumi.StringOutput `pulumi:"description"`
	// Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
	DisableTemplateValidation pulumi.BoolPtrOutput `pulumi:"disableTemplateValidation"`
	// Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
	Guidance pulumi.StringPtrOutput `pulumi:"guidance"`
	// Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
	Name pulumi.StringOutput `pulumi:"name"`
	// Identifier of the product.
	ProductId pulumi.StringOutput `pulumi:"productId"`
	// Provisioning artifact identifier.
	ProvisioningArtifactId pulumi.StringOutput `pulumi:"provisioningArtifactId"`
	// Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
	TemplatePhysicalId pulumi.StringPtrOutput `pulumi:"templatePhysicalId"`
	// Template source as URL of the CloudFormation template in Amazon S3.
	//
	// The following arguments are optional:
	TemplateUrl pulumi.StringPtrOutput `pulumi:"templateUrl"`
	// Type of provisioning artifact. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ProvisioningArtifactProperties.html) for valid list of values.
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewProvisioningArtifact registers a new resource with the given unique name, arguments, and options.
func NewProvisioningArtifact(ctx *pulumi.Context,
	name string, args *ProvisioningArtifactArgs, opts ...pulumi.ResourceOption) (*ProvisioningArtifact, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ProductId == nil {
		return nil, errors.New("invalid value for required argument 'ProductId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ProvisioningArtifact
	err := ctx.RegisterResource("aws:servicecatalog/provisioningArtifact:ProvisioningArtifact", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProvisioningArtifact gets an existing ProvisioningArtifact resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProvisioningArtifact(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProvisioningArtifactState, opts ...pulumi.ResourceOption) (*ProvisioningArtifact, error) {
	var resource ProvisioningArtifact
	err := ctx.ReadResource("aws:servicecatalog/provisioningArtifact:ProvisioningArtifact", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProvisioningArtifact resources.
type provisioningArtifactState struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
	AcceptLanguage *string `pulumi:"acceptLanguage"`
	// Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
	Active *bool `pulumi:"active"`
	// Time when the provisioning artifact was created.
	CreatedTime *string `pulumi:"createdTime"`
	// Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
	Description *string `pulumi:"description"`
	// Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
	DisableTemplateValidation *bool `pulumi:"disableTemplateValidation"`
	// Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
	Guidance *string `pulumi:"guidance"`
	// Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
	Name *string `pulumi:"name"`
	// Identifier of the product.
	ProductId *string `pulumi:"productId"`
	// Provisioning artifact identifier.
	ProvisioningArtifactId *string `pulumi:"provisioningArtifactId"`
	// Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
	TemplatePhysicalId *string `pulumi:"templatePhysicalId"`
	// Template source as URL of the CloudFormation template in Amazon S3.
	//
	// The following arguments are optional:
	TemplateUrl *string `pulumi:"templateUrl"`
	// Type of provisioning artifact. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ProvisioningArtifactProperties.html) for valid list of values.
	Type *string `pulumi:"type"`
}

type ProvisioningArtifactState struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
	AcceptLanguage pulumi.StringPtrInput
	// Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
	Active pulumi.BoolPtrInput
	// Time when the provisioning artifact was created.
	CreatedTime pulumi.StringPtrInput
	// Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
	Description pulumi.StringPtrInput
	// Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
	DisableTemplateValidation pulumi.BoolPtrInput
	// Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
	Guidance pulumi.StringPtrInput
	// Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
	Name pulumi.StringPtrInput
	// Identifier of the product.
	ProductId pulumi.StringPtrInput
	// Provisioning artifact identifier.
	ProvisioningArtifactId pulumi.StringPtrInput
	// Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
	TemplatePhysicalId pulumi.StringPtrInput
	// Template source as URL of the CloudFormation template in Amazon S3.
	//
	// The following arguments are optional:
	TemplateUrl pulumi.StringPtrInput
	// Type of provisioning artifact. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ProvisioningArtifactProperties.html) for valid list of values.
	Type pulumi.StringPtrInput
}

func (ProvisioningArtifactState) ElementType() reflect.Type {
	return reflect.TypeOf((*provisioningArtifactState)(nil)).Elem()
}

type provisioningArtifactArgs struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
	AcceptLanguage *string `pulumi:"acceptLanguage"`
	// Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
	Active *bool `pulumi:"active"`
	// Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
	Description *string `pulumi:"description"`
	// Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
	DisableTemplateValidation *bool `pulumi:"disableTemplateValidation"`
	// Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
	Guidance *string `pulumi:"guidance"`
	// Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
	Name *string `pulumi:"name"`
	// Identifier of the product.
	ProductId string `pulumi:"productId"`
	// Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
	TemplatePhysicalId *string `pulumi:"templatePhysicalId"`
	// Template source as URL of the CloudFormation template in Amazon S3.
	//
	// The following arguments are optional:
	TemplateUrl *string `pulumi:"templateUrl"`
	// Type of provisioning artifact. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ProvisioningArtifactProperties.html) for valid list of values.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a ProvisioningArtifact resource.
type ProvisioningArtifactArgs struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
	AcceptLanguage pulumi.StringPtrInput
	// Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
	Active pulumi.BoolPtrInput
	// Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
	Description pulumi.StringPtrInput
	// Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
	DisableTemplateValidation pulumi.BoolPtrInput
	// Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
	Guidance pulumi.StringPtrInput
	// Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
	Name pulumi.StringPtrInput
	// Identifier of the product.
	ProductId pulumi.StringInput
	// Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
	TemplatePhysicalId pulumi.StringPtrInput
	// Template source as URL of the CloudFormation template in Amazon S3.
	//
	// The following arguments are optional:
	TemplateUrl pulumi.StringPtrInput
	// Type of provisioning artifact. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ProvisioningArtifactProperties.html) for valid list of values.
	Type pulumi.StringPtrInput
}

func (ProvisioningArtifactArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*provisioningArtifactArgs)(nil)).Elem()
}

type ProvisioningArtifactInput interface {
	pulumi.Input

	ToProvisioningArtifactOutput() ProvisioningArtifactOutput
	ToProvisioningArtifactOutputWithContext(ctx context.Context) ProvisioningArtifactOutput
}

func (*ProvisioningArtifact) ElementType() reflect.Type {
	return reflect.TypeOf((**ProvisioningArtifact)(nil)).Elem()
}

func (i *ProvisioningArtifact) ToProvisioningArtifactOutput() ProvisioningArtifactOutput {
	return i.ToProvisioningArtifactOutputWithContext(context.Background())
}

func (i *ProvisioningArtifact) ToProvisioningArtifactOutputWithContext(ctx context.Context) ProvisioningArtifactOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProvisioningArtifactOutput)
}

// ProvisioningArtifactArrayInput is an input type that accepts ProvisioningArtifactArray and ProvisioningArtifactArrayOutput values.
// You can construct a concrete instance of `ProvisioningArtifactArrayInput` via:
//
//	ProvisioningArtifactArray{ ProvisioningArtifactArgs{...} }
type ProvisioningArtifactArrayInput interface {
	pulumi.Input

	ToProvisioningArtifactArrayOutput() ProvisioningArtifactArrayOutput
	ToProvisioningArtifactArrayOutputWithContext(context.Context) ProvisioningArtifactArrayOutput
}

type ProvisioningArtifactArray []ProvisioningArtifactInput

func (ProvisioningArtifactArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProvisioningArtifact)(nil)).Elem()
}

func (i ProvisioningArtifactArray) ToProvisioningArtifactArrayOutput() ProvisioningArtifactArrayOutput {
	return i.ToProvisioningArtifactArrayOutputWithContext(context.Background())
}

func (i ProvisioningArtifactArray) ToProvisioningArtifactArrayOutputWithContext(ctx context.Context) ProvisioningArtifactArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProvisioningArtifactArrayOutput)
}

// ProvisioningArtifactMapInput is an input type that accepts ProvisioningArtifactMap and ProvisioningArtifactMapOutput values.
// You can construct a concrete instance of `ProvisioningArtifactMapInput` via:
//
//	ProvisioningArtifactMap{ "key": ProvisioningArtifactArgs{...} }
type ProvisioningArtifactMapInput interface {
	pulumi.Input

	ToProvisioningArtifactMapOutput() ProvisioningArtifactMapOutput
	ToProvisioningArtifactMapOutputWithContext(context.Context) ProvisioningArtifactMapOutput
}

type ProvisioningArtifactMap map[string]ProvisioningArtifactInput

func (ProvisioningArtifactMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProvisioningArtifact)(nil)).Elem()
}

func (i ProvisioningArtifactMap) ToProvisioningArtifactMapOutput() ProvisioningArtifactMapOutput {
	return i.ToProvisioningArtifactMapOutputWithContext(context.Background())
}

func (i ProvisioningArtifactMap) ToProvisioningArtifactMapOutputWithContext(ctx context.Context) ProvisioningArtifactMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProvisioningArtifactMapOutput)
}

type ProvisioningArtifactOutput struct{ *pulumi.OutputState }

func (ProvisioningArtifactOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProvisioningArtifact)(nil)).Elem()
}

func (o ProvisioningArtifactOutput) ToProvisioningArtifactOutput() ProvisioningArtifactOutput {
	return o
}

func (o ProvisioningArtifactOutput) ToProvisioningArtifactOutputWithContext(ctx context.Context) ProvisioningArtifactOutput {
	return o
}

// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
func (o ProvisioningArtifactOutput) AcceptLanguage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProvisioningArtifact) pulumi.StringPtrOutput { return v.AcceptLanguage }).(pulumi.StringPtrOutput)
}

// Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
func (o ProvisioningArtifactOutput) Active() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProvisioningArtifact) pulumi.BoolPtrOutput { return v.Active }).(pulumi.BoolPtrOutput)
}

// Time when the provisioning artifact was created.
func (o ProvisioningArtifactOutput) CreatedTime() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisioningArtifact) pulumi.StringOutput { return v.CreatedTime }).(pulumi.StringOutput)
}

// Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
func (o ProvisioningArtifactOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisioningArtifact) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
func (o ProvisioningArtifactOutput) DisableTemplateValidation() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ProvisioningArtifact) pulumi.BoolPtrOutput { return v.DisableTemplateValidation }).(pulumi.BoolPtrOutput)
}

// Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
func (o ProvisioningArtifactOutput) Guidance() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProvisioningArtifact) pulumi.StringPtrOutput { return v.Guidance }).(pulumi.StringPtrOutput)
}

// Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
func (o ProvisioningArtifactOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisioningArtifact) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Identifier of the product.
func (o ProvisioningArtifactOutput) ProductId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisioningArtifact) pulumi.StringOutput { return v.ProductId }).(pulumi.StringOutput)
}

// Provisioning artifact identifier.
func (o ProvisioningArtifactOutput) ProvisioningArtifactId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProvisioningArtifact) pulumi.StringOutput { return v.ProvisioningArtifactId }).(pulumi.StringOutput)
}

// Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
func (o ProvisioningArtifactOutput) TemplatePhysicalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProvisioningArtifact) pulumi.StringPtrOutput { return v.TemplatePhysicalId }).(pulumi.StringPtrOutput)
}

// Template source as URL of the CloudFormation template in Amazon S3.
//
// The following arguments are optional:
func (o ProvisioningArtifactOutput) TemplateUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProvisioningArtifact) pulumi.StringPtrOutput { return v.TemplateUrl }).(pulumi.StringPtrOutput)
}

// Type of provisioning artifact. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ProvisioningArtifactProperties.html) for valid list of values.
func (o ProvisioningArtifactOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProvisioningArtifact) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

type ProvisioningArtifactArrayOutput struct{ *pulumi.OutputState }

func (ProvisioningArtifactArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProvisioningArtifact)(nil)).Elem()
}

func (o ProvisioningArtifactArrayOutput) ToProvisioningArtifactArrayOutput() ProvisioningArtifactArrayOutput {
	return o
}

func (o ProvisioningArtifactArrayOutput) ToProvisioningArtifactArrayOutputWithContext(ctx context.Context) ProvisioningArtifactArrayOutput {
	return o
}

func (o ProvisioningArtifactArrayOutput) Index(i pulumi.IntInput) ProvisioningArtifactOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProvisioningArtifact {
		return vs[0].([]*ProvisioningArtifact)[vs[1].(int)]
	}).(ProvisioningArtifactOutput)
}

type ProvisioningArtifactMapOutput struct{ *pulumi.OutputState }

func (ProvisioningArtifactMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProvisioningArtifact)(nil)).Elem()
}

func (o ProvisioningArtifactMapOutput) ToProvisioningArtifactMapOutput() ProvisioningArtifactMapOutput {
	return o
}

func (o ProvisioningArtifactMapOutput) ToProvisioningArtifactMapOutputWithContext(ctx context.Context) ProvisioningArtifactMapOutput {
	return o
}

func (o ProvisioningArtifactMapOutput) MapIndex(k pulumi.StringInput) ProvisioningArtifactOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProvisioningArtifact {
		return vs[0].(map[string]*ProvisioningArtifact)[vs[1].(string)]
	}).(ProvisioningArtifactOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProvisioningArtifactInput)(nil)).Elem(), &ProvisioningArtifact{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProvisioningArtifactArrayInput)(nil)).Elem(), ProvisioningArtifactArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProvisioningArtifactMapInput)(nil)).Elem(), ProvisioningArtifactMap{})
	pulumi.RegisterOutputType(ProvisioningArtifactOutput{})
	pulumi.RegisterOutputType(ProvisioningArtifactArrayOutput{})
	pulumi.RegisterOutputType(ProvisioningArtifactMapOutput{})
}
