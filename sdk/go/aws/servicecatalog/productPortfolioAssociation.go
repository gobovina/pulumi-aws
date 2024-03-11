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

// Manages a Service Catalog Product Portfolio Association.
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
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/servicecatalog"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := servicecatalog.NewProductPortfolioAssociation(ctx, "example", &servicecatalog.ProductPortfolioAssociationArgs{
//				PortfolioId: pulumi.String("port-68656c6c6f"),
//				ProductId:   pulumi.String("prod-dnigbtea24ste"),
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
// Using `pulumi import`, import `aws_servicecatalog_product_portfolio_association` using the accept language, portfolio ID, and product ID. For example:
//
// ```sh
// $ pulumi import aws:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation example en:port-68656c6c6f:prod-dnigbtea24ste
// ```
type ProductPortfolioAssociation struct {
	pulumi.CustomResourceState

	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
	AcceptLanguage pulumi.StringPtrOutput `pulumi:"acceptLanguage"`
	// Portfolio identifier.
	PortfolioId pulumi.StringOutput `pulumi:"portfolioId"`
	// Product identifier.
	//
	// The following arguments are optional:
	ProductId pulumi.StringOutput `pulumi:"productId"`
	// Identifier of the source portfolio.
	SourcePortfolioId pulumi.StringPtrOutput `pulumi:"sourcePortfolioId"`
}

// NewProductPortfolioAssociation registers a new resource with the given unique name, arguments, and options.
func NewProductPortfolioAssociation(ctx *pulumi.Context,
	name string, args *ProductPortfolioAssociationArgs, opts ...pulumi.ResourceOption) (*ProductPortfolioAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PortfolioId == nil {
		return nil, errors.New("invalid value for required argument 'PortfolioId'")
	}
	if args.ProductId == nil {
		return nil, errors.New("invalid value for required argument 'ProductId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ProductPortfolioAssociation
	err := ctx.RegisterResource("aws:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProductPortfolioAssociation gets an existing ProductPortfolioAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProductPortfolioAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProductPortfolioAssociationState, opts ...pulumi.ResourceOption) (*ProductPortfolioAssociation, error) {
	var resource ProductPortfolioAssociation
	err := ctx.ReadResource("aws:servicecatalog/productPortfolioAssociation:ProductPortfolioAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProductPortfolioAssociation resources.
type productPortfolioAssociationState struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
	AcceptLanguage *string `pulumi:"acceptLanguage"`
	// Portfolio identifier.
	PortfolioId *string `pulumi:"portfolioId"`
	// Product identifier.
	//
	// The following arguments are optional:
	ProductId *string `pulumi:"productId"`
	// Identifier of the source portfolio.
	SourcePortfolioId *string `pulumi:"sourcePortfolioId"`
}

type ProductPortfolioAssociationState struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
	AcceptLanguage pulumi.StringPtrInput
	// Portfolio identifier.
	PortfolioId pulumi.StringPtrInput
	// Product identifier.
	//
	// The following arguments are optional:
	ProductId pulumi.StringPtrInput
	// Identifier of the source portfolio.
	SourcePortfolioId pulumi.StringPtrInput
}

func (ProductPortfolioAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*productPortfolioAssociationState)(nil)).Elem()
}

type productPortfolioAssociationArgs struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
	AcceptLanguage *string `pulumi:"acceptLanguage"`
	// Portfolio identifier.
	PortfolioId string `pulumi:"portfolioId"`
	// Product identifier.
	//
	// The following arguments are optional:
	ProductId string `pulumi:"productId"`
	// Identifier of the source portfolio.
	SourcePortfolioId *string `pulumi:"sourcePortfolioId"`
}

// The set of arguments for constructing a ProductPortfolioAssociation resource.
type ProductPortfolioAssociationArgs struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
	AcceptLanguage pulumi.StringPtrInput
	// Portfolio identifier.
	PortfolioId pulumi.StringInput
	// Product identifier.
	//
	// The following arguments are optional:
	ProductId pulumi.StringInput
	// Identifier of the source portfolio.
	SourcePortfolioId pulumi.StringPtrInput
}

func (ProductPortfolioAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*productPortfolioAssociationArgs)(nil)).Elem()
}

type ProductPortfolioAssociationInput interface {
	pulumi.Input

	ToProductPortfolioAssociationOutput() ProductPortfolioAssociationOutput
	ToProductPortfolioAssociationOutputWithContext(ctx context.Context) ProductPortfolioAssociationOutput
}

func (*ProductPortfolioAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**ProductPortfolioAssociation)(nil)).Elem()
}

func (i *ProductPortfolioAssociation) ToProductPortfolioAssociationOutput() ProductPortfolioAssociationOutput {
	return i.ToProductPortfolioAssociationOutputWithContext(context.Background())
}

func (i *ProductPortfolioAssociation) ToProductPortfolioAssociationOutputWithContext(ctx context.Context) ProductPortfolioAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProductPortfolioAssociationOutput)
}

// ProductPortfolioAssociationArrayInput is an input type that accepts ProductPortfolioAssociationArray and ProductPortfolioAssociationArrayOutput values.
// You can construct a concrete instance of `ProductPortfolioAssociationArrayInput` via:
//
//	ProductPortfolioAssociationArray{ ProductPortfolioAssociationArgs{...} }
type ProductPortfolioAssociationArrayInput interface {
	pulumi.Input

	ToProductPortfolioAssociationArrayOutput() ProductPortfolioAssociationArrayOutput
	ToProductPortfolioAssociationArrayOutputWithContext(context.Context) ProductPortfolioAssociationArrayOutput
}

type ProductPortfolioAssociationArray []ProductPortfolioAssociationInput

func (ProductPortfolioAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProductPortfolioAssociation)(nil)).Elem()
}

func (i ProductPortfolioAssociationArray) ToProductPortfolioAssociationArrayOutput() ProductPortfolioAssociationArrayOutput {
	return i.ToProductPortfolioAssociationArrayOutputWithContext(context.Background())
}

func (i ProductPortfolioAssociationArray) ToProductPortfolioAssociationArrayOutputWithContext(ctx context.Context) ProductPortfolioAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProductPortfolioAssociationArrayOutput)
}

// ProductPortfolioAssociationMapInput is an input type that accepts ProductPortfolioAssociationMap and ProductPortfolioAssociationMapOutput values.
// You can construct a concrete instance of `ProductPortfolioAssociationMapInput` via:
//
//	ProductPortfolioAssociationMap{ "key": ProductPortfolioAssociationArgs{...} }
type ProductPortfolioAssociationMapInput interface {
	pulumi.Input

	ToProductPortfolioAssociationMapOutput() ProductPortfolioAssociationMapOutput
	ToProductPortfolioAssociationMapOutputWithContext(context.Context) ProductPortfolioAssociationMapOutput
}

type ProductPortfolioAssociationMap map[string]ProductPortfolioAssociationInput

func (ProductPortfolioAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProductPortfolioAssociation)(nil)).Elem()
}

func (i ProductPortfolioAssociationMap) ToProductPortfolioAssociationMapOutput() ProductPortfolioAssociationMapOutput {
	return i.ToProductPortfolioAssociationMapOutputWithContext(context.Background())
}

func (i ProductPortfolioAssociationMap) ToProductPortfolioAssociationMapOutputWithContext(ctx context.Context) ProductPortfolioAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProductPortfolioAssociationMapOutput)
}

type ProductPortfolioAssociationOutput struct{ *pulumi.OutputState }

func (ProductPortfolioAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProductPortfolioAssociation)(nil)).Elem()
}

func (o ProductPortfolioAssociationOutput) ToProductPortfolioAssociationOutput() ProductPortfolioAssociationOutput {
	return o
}

func (o ProductPortfolioAssociationOutput) ToProductPortfolioAssociationOutputWithContext(ctx context.Context) ProductPortfolioAssociationOutput {
	return o
}

// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
func (o ProductPortfolioAssociationOutput) AcceptLanguage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProductPortfolioAssociation) pulumi.StringPtrOutput { return v.AcceptLanguage }).(pulumi.StringPtrOutput)
}

// Portfolio identifier.
func (o ProductPortfolioAssociationOutput) PortfolioId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProductPortfolioAssociation) pulumi.StringOutput { return v.PortfolioId }).(pulumi.StringOutput)
}

// Product identifier.
//
// The following arguments are optional:
func (o ProductPortfolioAssociationOutput) ProductId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProductPortfolioAssociation) pulumi.StringOutput { return v.ProductId }).(pulumi.StringOutput)
}

// Identifier of the source portfolio.
func (o ProductPortfolioAssociationOutput) SourcePortfolioId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProductPortfolioAssociation) pulumi.StringPtrOutput { return v.SourcePortfolioId }).(pulumi.StringPtrOutput)
}

type ProductPortfolioAssociationArrayOutput struct{ *pulumi.OutputState }

func (ProductPortfolioAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProductPortfolioAssociation)(nil)).Elem()
}

func (o ProductPortfolioAssociationArrayOutput) ToProductPortfolioAssociationArrayOutput() ProductPortfolioAssociationArrayOutput {
	return o
}

func (o ProductPortfolioAssociationArrayOutput) ToProductPortfolioAssociationArrayOutputWithContext(ctx context.Context) ProductPortfolioAssociationArrayOutput {
	return o
}

func (o ProductPortfolioAssociationArrayOutput) Index(i pulumi.IntInput) ProductPortfolioAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProductPortfolioAssociation {
		return vs[0].([]*ProductPortfolioAssociation)[vs[1].(int)]
	}).(ProductPortfolioAssociationOutput)
}

type ProductPortfolioAssociationMapOutput struct{ *pulumi.OutputState }

func (ProductPortfolioAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProductPortfolioAssociation)(nil)).Elem()
}

func (o ProductPortfolioAssociationMapOutput) ToProductPortfolioAssociationMapOutput() ProductPortfolioAssociationMapOutput {
	return o
}

func (o ProductPortfolioAssociationMapOutput) ToProductPortfolioAssociationMapOutputWithContext(ctx context.Context) ProductPortfolioAssociationMapOutput {
	return o
}

func (o ProductPortfolioAssociationMapOutput) MapIndex(k pulumi.StringInput) ProductPortfolioAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProductPortfolioAssociation {
		return vs[0].(map[string]*ProductPortfolioAssociation)[vs[1].(string)]
	}).(ProductPortfolioAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProductPortfolioAssociationInput)(nil)).Elem(), &ProductPortfolioAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProductPortfolioAssociationArrayInput)(nil)).Elem(), ProductPortfolioAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProductPortfolioAssociationMapInput)(nil)).Elem(), ProductPortfolioAssociationMap{})
	pulumi.RegisterOutputType(ProductPortfolioAssociationOutput{})
	pulumi.RegisterOutputType(ProductPortfolioAssociationArrayOutput{})
	pulumi.RegisterOutputType(ProductPortfolioAssociationMapOutput{})
}
