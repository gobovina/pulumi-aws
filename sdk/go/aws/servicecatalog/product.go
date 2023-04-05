// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package servicecatalog

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Service Catalog Product.
//
// > **NOTE:** The user or role that uses this resources must have the `cloudformation:GetTemplate` IAM policy permission. This policy permission is required when using the `templatePhysicalId` argument.
//
// > A "provisioning artifact" is also referred to as a "version." A "distributor" is also referred to as a "vendor."
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/servicecatalog"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := servicecatalog.NewProduct(ctx, "example", &servicecatalog.ProductArgs{
//				Owner: pulumi.String("example-owner"),
//				ProvisioningArtifactParameters: &servicecatalog.ProductProvisioningArtifactParametersArgs{
//					TemplateUrl: pulumi.String("https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/temp1.json"),
//				},
//				Tags: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//				Type: pulumi.String("CLOUD_FORMATION_TEMPLATE"),
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
// `aws_servicecatalog_product` can be imported using the product ID, e.g.,
//
// ```sh
//
//	$ pulumi import aws:servicecatalog/product:Product example prod-dnigbtea24ste
//
// ```
type Product struct {
	pulumi.CustomResourceState

	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
	AcceptLanguage pulumi.StringPtrOutput `pulumi:"acceptLanguage"`
	// ARN of the product.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Time when the product was created.
	CreatedTime pulumi.StringOutput `pulumi:"createdTime"`
	// Description of the product.
	Description pulumi.StringOutput `pulumi:"description"`
	// Distributor (i.e., vendor) of the product.
	Distributor pulumi.StringOutput `pulumi:"distributor"`
	// Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
	HasDefaultPath pulumi.BoolOutput `pulumi:"hasDefaultPath"`
	// Name of the product.
	Name pulumi.StringOutput `pulumi:"name"`
	// Owner of the product.
	Owner pulumi.StringOutput `pulumi:"owner"`
	// Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
	ProvisioningArtifactParameters ProductProvisioningArtifactParametersOutput `pulumi:"provisioningArtifactParameters"`
	// Status of the product.
	Status pulumi.StringOutput `pulumi:"status"`
	// Support information about the product.
	SupportDescription pulumi.StringOutput `pulumi:"supportDescription"`
	// Contact email for product support.
	SupportEmail pulumi.StringOutput `pulumi:"supportEmail"`
	// Contact URL for product support.
	SupportUrl pulumi.StringOutput `pulumi:"supportUrl"`
	// Tags to apply to the product. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewProduct registers a new resource with the given unique name, arguments, and options.
func NewProduct(ctx *pulumi.Context,
	name string, args *ProductArgs, opts ...pulumi.ResourceOption) (*Product, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Owner == nil {
		return nil, errors.New("invalid value for required argument 'Owner'")
	}
	if args.ProvisioningArtifactParameters == nil {
		return nil, errors.New("invalid value for required argument 'ProvisioningArtifactParameters'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource Product
	err := ctx.RegisterResource("aws:servicecatalog/product:Product", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProduct gets an existing Product resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProduct(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProductState, opts ...pulumi.ResourceOption) (*Product, error) {
	var resource Product
	err := ctx.ReadResource("aws:servicecatalog/product:Product", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Product resources.
type productState struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
	AcceptLanguage *string `pulumi:"acceptLanguage"`
	// ARN of the product.
	Arn *string `pulumi:"arn"`
	// Time when the product was created.
	CreatedTime *string `pulumi:"createdTime"`
	// Description of the product.
	Description *string `pulumi:"description"`
	// Distributor (i.e., vendor) of the product.
	Distributor *string `pulumi:"distributor"`
	// Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
	HasDefaultPath *bool `pulumi:"hasDefaultPath"`
	// Name of the product.
	Name *string `pulumi:"name"`
	// Owner of the product.
	Owner *string `pulumi:"owner"`
	// Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
	ProvisioningArtifactParameters *ProductProvisioningArtifactParameters `pulumi:"provisioningArtifactParameters"`
	// Status of the product.
	Status *string `pulumi:"status"`
	// Support information about the product.
	SupportDescription *string `pulumi:"supportDescription"`
	// Contact email for product support.
	SupportEmail *string `pulumi:"supportEmail"`
	// Contact URL for product support.
	SupportUrl *string `pulumi:"supportUrl"`
	// Tags to apply to the product. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
	Type *string `pulumi:"type"`
}

type ProductState struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
	AcceptLanguage pulumi.StringPtrInput
	// ARN of the product.
	Arn pulumi.StringPtrInput
	// Time when the product was created.
	CreatedTime pulumi.StringPtrInput
	// Description of the product.
	Description pulumi.StringPtrInput
	// Distributor (i.e., vendor) of the product.
	Distributor pulumi.StringPtrInput
	// Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
	HasDefaultPath pulumi.BoolPtrInput
	// Name of the product.
	Name pulumi.StringPtrInput
	// Owner of the product.
	Owner pulumi.StringPtrInput
	// Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
	ProvisioningArtifactParameters ProductProvisioningArtifactParametersPtrInput
	// Status of the product.
	Status pulumi.StringPtrInput
	// Support information about the product.
	SupportDescription pulumi.StringPtrInput
	// Contact email for product support.
	SupportEmail pulumi.StringPtrInput
	// Contact URL for product support.
	SupportUrl pulumi.StringPtrInput
	// Tags to apply to the product. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	// Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
	Type pulumi.StringPtrInput
}

func (ProductState) ElementType() reflect.Type {
	return reflect.TypeOf((*productState)(nil)).Elem()
}

type productArgs struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
	AcceptLanguage *string `pulumi:"acceptLanguage"`
	// Description of the product.
	Description *string `pulumi:"description"`
	// Distributor (i.e., vendor) of the product.
	Distributor *string `pulumi:"distributor"`
	// Name of the product.
	Name *string `pulumi:"name"`
	// Owner of the product.
	Owner string `pulumi:"owner"`
	// Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
	ProvisioningArtifactParameters ProductProvisioningArtifactParameters `pulumi:"provisioningArtifactParameters"`
	// Support information about the product.
	SupportDescription *string `pulumi:"supportDescription"`
	// Contact email for product support.
	SupportEmail *string `pulumi:"supportEmail"`
	// Contact URL for product support.
	SupportUrl *string `pulumi:"supportUrl"`
	// Tags to apply to the product. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a Product resource.
type ProductArgs struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
	AcceptLanguage pulumi.StringPtrInput
	// Description of the product.
	Description pulumi.StringPtrInput
	// Distributor (i.e., vendor) of the product.
	Distributor pulumi.StringPtrInput
	// Name of the product.
	Name pulumi.StringPtrInput
	// Owner of the product.
	Owner pulumi.StringInput
	// Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
	ProvisioningArtifactParameters ProductProvisioningArtifactParametersInput
	// Support information about the product.
	SupportDescription pulumi.StringPtrInput
	// Contact email for product support.
	SupportEmail pulumi.StringPtrInput
	// Contact URL for product support.
	SupportUrl pulumi.StringPtrInput
	// Tags to apply to the product. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	// Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
	Type pulumi.StringInput
}

func (ProductArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*productArgs)(nil)).Elem()
}

type ProductInput interface {
	pulumi.Input

	ToProductOutput() ProductOutput
	ToProductOutputWithContext(ctx context.Context) ProductOutput
}

func (*Product) ElementType() reflect.Type {
	return reflect.TypeOf((**Product)(nil)).Elem()
}

func (i *Product) ToProductOutput() ProductOutput {
	return i.ToProductOutputWithContext(context.Background())
}

func (i *Product) ToProductOutputWithContext(ctx context.Context) ProductOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProductOutput)
}

// ProductArrayInput is an input type that accepts ProductArray and ProductArrayOutput values.
// You can construct a concrete instance of `ProductArrayInput` via:
//
//	ProductArray{ ProductArgs{...} }
type ProductArrayInput interface {
	pulumi.Input

	ToProductArrayOutput() ProductArrayOutput
	ToProductArrayOutputWithContext(context.Context) ProductArrayOutput
}

type ProductArray []ProductInput

func (ProductArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Product)(nil)).Elem()
}

func (i ProductArray) ToProductArrayOutput() ProductArrayOutput {
	return i.ToProductArrayOutputWithContext(context.Background())
}

func (i ProductArray) ToProductArrayOutputWithContext(ctx context.Context) ProductArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProductArrayOutput)
}

// ProductMapInput is an input type that accepts ProductMap and ProductMapOutput values.
// You can construct a concrete instance of `ProductMapInput` via:
//
//	ProductMap{ "key": ProductArgs{...} }
type ProductMapInput interface {
	pulumi.Input

	ToProductMapOutput() ProductMapOutput
	ToProductMapOutputWithContext(context.Context) ProductMapOutput
}

type ProductMap map[string]ProductInput

func (ProductMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Product)(nil)).Elem()
}

func (i ProductMap) ToProductMapOutput() ProductMapOutput {
	return i.ToProductMapOutputWithContext(context.Background())
}

func (i ProductMap) ToProductMapOutputWithContext(ctx context.Context) ProductMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProductMapOutput)
}

type ProductOutput struct{ *pulumi.OutputState }

func (ProductOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Product)(nil)).Elem()
}

func (o ProductOutput) ToProductOutput() ProductOutput {
	return o
}

func (o ProductOutput) ToProductOutputWithContext(ctx context.Context) ProductOutput {
	return o
}

// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
func (o ProductOutput) AcceptLanguage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Product) pulumi.StringPtrOutput { return v.AcceptLanguage }).(pulumi.StringPtrOutput)
}

// ARN of the product.
func (o ProductOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Product) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Time when the product was created.
func (o ProductOutput) CreatedTime() pulumi.StringOutput {
	return o.ApplyT(func(v *Product) pulumi.StringOutput { return v.CreatedTime }).(pulumi.StringOutput)
}

// Description of the product.
func (o ProductOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Product) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Distributor (i.e., vendor) of the product.
func (o ProductOutput) Distributor() pulumi.StringOutput {
	return o.ApplyT(func(v *Product) pulumi.StringOutput { return v.Distributor }).(pulumi.StringOutput)
}

// Whether the product has a default path. If the product does not have a default path, call `ListLaunchPaths` to disambiguate between paths.  Otherwise, `ListLaunchPaths` is not required, and the output of ProductViewSummary can be used directly with `DescribeProvisioningParameters`.
func (o ProductOutput) HasDefaultPath() pulumi.BoolOutput {
	return o.ApplyT(func(v *Product) pulumi.BoolOutput { return v.HasDefaultPath }).(pulumi.BoolOutput)
}

// Name of the product.
func (o ProductOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Product) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Owner of the product.
func (o ProductOutput) Owner() pulumi.StringOutput {
	return o.ApplyT(func(v *Product) pulumi.StringOutput { return v.Owner }).(pulumi.StringOutput)
}

// Configuration block for provisioning artifact (i.e., version) parameters. Detailed below.
func (o ProductOutput) ProvisioningArtifactParameters() ProductProvisioningArtifactParametersOutput {
	return o.ApplyT(func(v *Product) ProductProvisioningArtifactParametersOutput { return v.ProvisioningArtifactParameters }).(ProductProvisioningArtifactParametersOutput)
}

// Status of the product.
func (o ProductOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Product) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Support information about the product.
func (o ProductOutput) SupportDescription() pulumi.StringOutput {
	return o.ApplyT(func(v *Product) pulumi.StringOutput { return v.SupportDescription }).(pulumi.StringOutput)
}

// Contact email for product support.
func (o ProductOutput) SupportEmail() pulumi.StringOutput {
	return o.ApplyT(func(v *Product) pulumi.StringOutput { return v.SupportEmail }).(pulumi.StringOutput)
}

// Contact URL for product support.
func (o ProductOutput) SupportUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Product) pulumi.StringOutput { return v.SupportUrl }).(pulumi.StringOutput)
}

// Tags to apply to the product. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ProductOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Product) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o ProductOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Product) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Type of product. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_CreateProduct.html#API_CreateProduct_RequestSyntax) for valid list of values.
func (o ProductOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Product) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type ProductArrayOutput struct{ *pulumi.OutputState }

func (ProductArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Product)(nil)).Elem()
}

func (o ProductArrayOutput) ToProductArrayOutput() ProductArrayOutput {
	return o
}

func (o ProductArrayOutput) ToProductArrayOutputWithContext(ctx context.Context) ProductArrayOutput {
	return o
}

func (o ProductArrayOutput) Index(i pulumi.IntInput) ProductOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Product {
		return vs[0].([]*Product)[vs[1].(int)]
	}).(ProductOutput)
}

type ProductMapOutput struct{ *pulumi.OutputState }

func (ProductMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Product)(nil)).Elem()
}

func (o ProductMapOutput) ToProductMapOutput() ProductMapOutput {
	return o
}

func (o ProductMapOutput) ToProductMapOutputWithContext(ctx context.Context) ProductMapOutput {
	return o
}

func (o ProductMapOutput) MapIndex(k pulumi.StringInput) ProductOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Product {
		return vs[0].(map[string]*Product)[vs[1].(string)]
	}).(ProductOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProductInput)(nil)).Elem(), &Product{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProductArrayInput)(nil)).Elem(), ProductArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProductMapInput)(nil)).Elem(), ProductMap{})
	pulumi.RegisterOutputType(ProductOutput{})
	pulumi.RegisterOutputType(ProductArrayOutput{})
	pulumi.RegisterOutputType(ProductMapOutput{})
}
