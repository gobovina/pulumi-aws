// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package s3

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an S3 bucket website configuration resource. For more information, see [Hosting Websites on S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/s3"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := s3.NewBucketWebsiteConfigurationV2(ctx, "example", &s3.BucketWebsiteConfigurationV2Args{
// 			Bucket: pulumi.Any(aws_s3_bucket.Example.Bucket),
// 			IndexDocument: &s3.BucketWebsiteConfigurationV2IndexDocumentArgs{
// 				Suffix: pulumi.String("index.html"),
// 			},
// 			ErrorDocument: &s3.BucketWebsiteConfigurationV2ErrorDocumentArgs{
// 				Key: pulumi.String("error.html"),
// 			},
// 			RoutingRules: s3.BucketWebsiteConfigurationV2RoutingRuleArray{
// 				&s3.BucketWebsiteConfigurationV2RoutingRuleArgs{
// 					Condition: &s3.BucketWebsiteConfigurationV2RoutingRuleConditionArgs{
// 						KeyPrefixEquals: pulumi.String("docs/"),
// 					},
// 					Redirect: &s3.BucketWebsiteConfigurationV2RoutingRuleRedirectArgs{
// 						ReplaceKeyPrefixWith: pulumi.String("documents/"),
// 					},
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// S3 bucket website configuration can be imported in one of two ways. If the owner (account ID) of the source bucket is the same account used to configure the Terraform AWS Provider, the S3 bucket website configuration resource should be imported using the `bucket` e.g.,
//
// ```sh
//  $ pulumi import aws:s3/bucketWebsiteConfigurationV2:BucketWebsiteConfigurationV2 example bucket-name
// ```
//
//  If the owner (account ID) of the source bucket differs from the account used to configure the Terraform AWS Provider, the S3 bucket website configuration resource should be imported using the `bucket` and `expected_bucket_owner` separated by a comma (`,`) e.g.,
//
// ```sh
//  $ pulumi import aws:s3/bucketWebsiteConfigurationV2:BucketWebsiteConfigurationV2 example bucket-name,123456789012
// ```
type BucketWebsiteConfigurationV2 struct {
	pulumi.CustomResourceState

	// The name of the bucket.
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// The name of the error document for the website detailed below.
	ErrorDocument BucketWebsiteConfigurationV2ErrorDocumentPtrOutput `pulumi:"errorDocument"`
	// The account ID of the expected bucket owner.
	ExpectedBucketOwner pulumi.StringPtrOutput `pulumi:"expectedBucketOwner"`
	// The name of the index document for the website detailed below.
	IndexDocument BucketWebsiteConfigurationV2IndexDocumentPtrOutput `pulumi:"indexDocument"`
	// The redirect behavior for every request to this bucket's website endpoint detailed below. Conflicts with `errorDocument`, `indexDocument`, and `routingRule`.
	RedirectAllRequestsTo BucketWebsiteConfigurationV2RedirectAllRequestsToPtrOutput `pulumi:"redirectAllRequestsTo"`
	// List of rules that define when a redirect is applied and the redirect behavior detailed below.
	RoutingRules BucketWebsiteConfigurationV2RoutingRuleArrayOutput `pulumi:"routingRules"`
	// The domain of the website endpoint. This is used to create Route 53 alias records.
	WebsiteDomain pulumi.StringOutput `pulumi:"websiteDomain"`
	// The website endpoint.
	WebsiteEndpoint pulumi.StringOutput `pulumi:"websiteEndpoint"`
}

// NewBucketWebsiteConfigurationV2 registers a new resource with the given unique name, arguments, and options.
func NewBucketWebsiteConfigurationV2(ctx *pulumi.Context,
	name string, args *BucketWebsiteConfigurationV2Args, opts ...pulumi.ResourceOption) (*BucketWebsiteConfigurationV2, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	var resource BucketWebsiteConfigurationV2
	err := ctx.RegisterResource("aws:s3/bucketWebsiteConfigurationV2:BucketWebsiteConfigurationV2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBucketWebsiteConfigurationV2 gets an existing BucketWebsiteConfigurationV2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBucketWebsiteConfigurationV2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BucketWebsiteConfigurationV2State, opts ...pulumi.ResourceOption) (*BucketWebsiteConfigurationV2, error) {
	var resource BucketWebsiteConfigurationV2
	err := ctx.ReadResource("aws:s3/bucketWebsiteConfigurationV2:BucketWebsiteConfigurationV2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BucketWebsiteConfigurationV2 resources.
type bucketWebsiteConfigurationV2State struct {
	// The name of the bucket.
	Bucket *string `pulumi:"bucket"`
	// The name of the error document for the website detailed below.
	ErrorDocument *BucketWebsiteConfigurationV2ErrorDocument `pulumi:"errorDocument"`
	// The account ID of the expected bucket owner.
	ExpectedBucketOwner *string `pulumi:"expectedBucketOwner"`
	// The name of the index document for the website detailed below.
	IndexDocument *BucketWebsiteConfigurationV2IndexDocument `pulumi:"indexDocument"`
	// The redirect behavior for every request to this bucket's website endpoint detailed below. Conflicts with `errorDocument`, `indexDocument`, and `routingRule`.
	RedirectAllRequestsTo *BucketWebsiteConfigurationV2RedirectAllRequestsTo `pulumi:"redirectAllRequestsTo"`
	// List of rules that define when a redirect is applied and the redirect behavior detailed below.
	RoutingRules []BucketWebsiteConfigurationV2RoutingRule `pulumi:"routingRules"`
	// The domain of the website endpoint. This is used to create Route 53 alias records.
	WebsiteDomain *string `pulumi:"websiteDomain"`
	// The website endpoint.
	WebsiteEndpoint *string `pulumi:"websiteEndpoint"`
}

type BucketWebsiteConfigurationV2State struct {
	// The name of the bucket.
	Bucket pulumi.StringPtrInput
	// The name of the error document for the website detailed below.
	ErrorDocument BucketWebsiteConfigurationV2ErrorDocumentPtrInput
	// The account ID of the expected bucket owner.
	ExpectedBucketOwner pulumi.StringPtrInput
	// The name of the index document for the website detailed below.
	IndexDocument BucketWebsiteConfigurationV2IndexDocumentPtrInput
	// The redirect behavior for every request to this bucket's website endpoint detailed below. Conflicts with `errorDocument`, `indexDocument`, and `routingRule`.
	RedirectAllRequestsTo BucketWebsiteConfigurationV2RedirectAllRequestsToPtrInput
	// List of rules that define when a redirect is applied and the redirect behavior detailed below.
	RoutingRules BucketWebsiteConfigurationV2RoutingRuleArrayInput
	// The domain of the website endpoint. This is used to create Route 53 alias records.
	WebsiteDomain pulumi.StringPtrInput
	// The website endpoint.
	WebsiteEndpoint pulumi.StringPtrInput
}

func (BucketWebsiteConfigurationV2State) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketWebsiteConfigurationV2State)(nil)).Elem()
}

type bucketWebsiteConfigurationV2Args struct {
	// The name of the bucket.
	Bucket string `pulumi:"bucket"`
	// The name of the error document for the website detailed below.
	ErrorDocument *BucketWebsiteConfigurationV2ErrorDocument `pulumi:"errorDocument"`
	// The account ID of the expected bucket owner.
	ExpectedBucketOwner *string `pulumi:"expectedBucketOwner"`
	// The name of the index document for the website detailed below.
	IndexDocument *BucketWebsiteConfigurationV2IndexDocument `pulumi:"indexDocument"`
	// The redirect behavior for every request to this bucket's website endpoint detailed below. Conflicts with `errorDocument`, `indexDocument`, and `routingRule`.
	RedirectAllRequestsTo *BucketWebsiteConfigurationV2RedirectAllRequestsTo `pulumi:"redirectAllRequestsTo"`
	// List of rules that define when a redirect is applied and the redirect behavior detailed below.
	RoutingRules []BucketWebsiteConfigurationV2RoutingRule `pulumi:"routingRules"`
}

// The set of arguments for constructing a BucketWebsiteConfigurationV2 resource.
type BucketWebsiteConfigurationV2Args struct {
	// The name of the bucket.
	Bucket pulumi.StringInput
	// The name of the error document for the website detailed below.
	ErrorDocument BucketWebsiteConfigurationV2ErrorDocumentPtrInput
	// The account ID of the expected bucket owner.
	ExpectedBucketOwner pulumi.StringPtrInput
	// The name of the index document for the website detailed below.
	IndexDocument BucketWebsiteConfigurationV2IndexDocumentPtrInput
	// The redirect behavior for every request to this bucket's website endpoint detailed below. Conflicts with `errorDocument`, `indexDocument`, and `routingRule`.
	RedirectAllRequestsTo BucketWebsiteConfigurationV2RedirectAllRequestsToPtrInput
	// List of rules that define when a redirect is applied and the redirect behavior detailed below.
	RoutingRules BucketWebsiteConfigurationV2RoutingRuleArrayInput
}

func (BucketWebsiteConfigurationV2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketWebsiteConfigurationV2Args)(nil)).Elem()
}

type BucketWebsiteConfigurationV2Input interface {
	pulumi.Input

	ToBucketWebsiteConfigurationV2Output() BucketWebsiteConfigurationV2Output
	ToBucketWebsiteConfigurationV2OutputWithContext(ctx context.Context) BucketWebsiteConfigurationV2Output
}

func (*BucketWebsiteConfigurationV2) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketWebsiteConfigurationV2)(nil)).Elem()
}

func (i *BucketWebsiteConfigurationV2) ToBucketWebsiteConfigurationV2Output() BucketWebsiteConfigurationV2Output {
	return i.ToBucketWebsiteConfigurationV2OutputWithContext(context.Background())
}

func (i *BucketWebsiteConfigurationV2) ToBucketWebsiteConfigurationV2OutputWithContext(ctx context.Context) BucketWebsiteConfigurationV2Output {
	return pulumi.ToOutputWithContext(ctx, i).(BucketWebsiteConfigurationV2Output)
}

// BucketWebsiteConfigurationV2ArrayInput is an input type that accepts BucketWebsiteConfigurationV2Array and BucketWebsiteConfigurationV2ArrayOutput values.
// You can construct a concrete instance of `BucketWebsiteConfigurationV2ArrayInput` via:
//
//          BucketWebsiteConfigurationV2Array{ BucketWebsiteConfigurationV2Args{...} }
type BucketWebsiteConfigurationV2ArrayInput interface {
	pulumi.Input

	ToBucketWebsiteConfigurationV2ArrayOutput() BucketWebsiteConfigurationV2ArrayOutput
	ToBucketWebsiteConfigurationV2ArrayOutputWithContext(context.Context) BucketWebsiteConfigurationV2ArrayOutput
}

type BucketWebsiteConfigurationV2Array []BucketWebsiteConfigurationV2Input

func (BucketWebsiteConfigurationV2Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketWebsiteConfigurationV2)(nil)).Elem()
}

func (i BucketWebsiteConfigurationV2Array) ToBucketWebsiteConfigurationV2ArrayOutput() BucketWebsiteConfigurationV2ArrayOutput {
	return i.ToBucketWebsiteConfigurationV2ArrayOutputWithContext(context.Background())
}

func (i BucketWebsiteConfigurationV2Array) ToBucketWebsiteConfigurationV2ArrayOutputWithContext(ctx context.Context) BucketWebsiteConfigurationV2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketWebsiteConfigurationV2ArrayOutput)
}

// BucketWebsiteConfigurationV2MapInput is an input type that accepts BucketWebsiteConfigurationV2Map and BucketWebsiteConfigurationV2MapOutput values.
// You can construct a concrete instance of `BucketWebsiteConfigurationV2MapInput` via:
//
//          BucketWebsiteConfigurationV2Map{ "key": BucketWebsiteConfigurationV2Args{...} }
type BucketWebsiteConfigurationV2MapInput interface {
	pulumi.Input

	ToBucketWebsiteConfigurationV2MapOutput() BucketWebsiteConfigurationV2MapOutput
	ToBucketWebsiteConfigurationV2MapOutputWithContext(context.Context) BucketWebsiteConfigurationV2MapOutput
}

type BucketWebsiteConfigurationV2Map map[string]BucketWebsiteConfigurationV2Input

func (BucketWebsiteConfigurationV2Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketWebsiteConfigurationV2)(nil)).Elem()
}

func (i BucketWebsiteConfigurationV2Map) ToBucketWebsiteConfigurationV2MapOutput() BucketWebsiteConfigurationV2MapOutput {
	return i.ToBucketWebsiteConfigurationV2MapOutputWithContext(context.Background())
}

func (i BucketWebsiteConfigurationV2Map) ToBucketWebsiteConfigurationV2MapOutputWithContext(ctx context.Context) BucketWebsiteConfigurationV2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketWebsiteConfigurationV2MapOutput)
}

type BucketWebsiteConfigurationV2Output struct{ *pulumi.OutputState }

func (BucketWebsiteConfigurationV2Output) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketWebsiteConfigurationV2)(nil)).Elem()
}

func (o BucketWebsiteConfigurationV2Output) ToBucketWebsiteConfigurationV2Output() BucketWebsiteConfigurationV2Output {
	return o
}

func (o BucketWebsiteConfigurationV2Output) ToBucketWebsiteConfigurationV2OutputWithContext(ctx context.Context) BucketWebsiteConfigurationV2Output {
	return o
}

type BucketWebsiteConfigurationV2ArrayOutput struct{ *pulumi.OutputState }

func (BucketWebsiteConfigurationV2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketWebsiteConfigurationV2)(nil)).Elem()
}

func (o BucketWebsiteConfigurationV2ArrayOutput) ToBucketWebsiteConfigurationV2ArrayOutput() BucketWebsiteConfigurationV2ArrayOutput {
	return o
}

func (o BucketWebsiteConfigurationV2ArrayOutput) ToBucketWebsiteConfigurationV2ArrayOutputWithContext(ctx context.Context) BucketWebsiteConfigurationV2ArrayOutput {
	return o
}

func (o BucketWebsiteConfigurationV2ArrayOutput) Index(i pulumi.IntInput) BucketWebsiteConfigurationV2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BucketWebsiteConfigurationV2 {
		return vs[0].([]*BucketWebsiteConfigurationV2)[vs[1].(int)]
	}).(BucketWebsiteConfigurationV2Output)
}

type BucketWebsiteConfigurationV2MapOutput struct{ *pulumi.OutputState }

func (BucketWebsiteConfigurationV2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketWebsiteConfigurationV2)(nil)).Elem()
}

func (o BucketWebsiteConfigurationV2MapOutput) ToBucketWebsiteConfigurationV2MapOutput() BucketWebsiteConfigurationV2MapOutput {
	return o
}

func (o BucketWebsiteConfigurationV2MapOutput) ToBucketWebsiteConfigurationV2MapOutputWithContext(ctx context.Context) BucketWebsiteConfigurationV2MapOutput {
	return o
}

func (o BucketWebsiteConfigurationV2MapOutput) MapIndex(k pulumi.StringInput) BucketWebsiteConfigurationV2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BucketWebsiteConfigurationV2 {
		return vs[0].(map[string]*BucketWebsiteConfigurationV2)[vs[1].(string)]
	}).(BucketWebsiteConfigurationV2Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BucketWebsiteConfigurationV2Input)(nil)).Elem(), &BucketWebsiteConfigurationV2{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketWebsiteConfigurationV2ArrayInput)(nil)).Elem(), BucketWebsiteConfigurationV2Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketWebsiteConfigurationV2MapInput)(nil)).Elem(), BucketWebsiteConfigurationV2Map{})
	pulumi.RegisterOutputType(BucketWebsiteConfigurationV2Output{})
	pulumi.RegisterOutputType(BucketWebsiteConfigurationV2ArrayOutput{})
	pulumi.RegisterOutputType(BucketWebsiteConfigurationV2MapOutput{})
}
