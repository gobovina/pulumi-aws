// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package s3

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a specific S3 bucket.
//
// This resource may prove useful when setting up a Route53 record, or an origin for a CloudFront
// Distribution.
//
// ## Example Usage
//
// ### Route53 Record
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/route53"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/s3"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			selected, err := s3.LookupBucket(ctx, &s3.LookupBucketArgs{
//				Bucket: "bucket.test.com",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			testZone, err := route53.LookupZone(ctx, &route53.LookupZoneArgs{
//				Name: pulumi.StringRef("test.com."),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = route53.NewRecord(ctx, "example", &route53.RecordArgs{
//				ZoneId: *pulumi.String(testZone.Id),
//				Name:   pulumi.String("bucket"),
//				Type:   pulumi.String("A"),
//				Aliases: route53.RecordAliasArray{
//					&route53.RecordAliasArgs{
//						Name:   *pulumi.String(selected.WebsiteDomain),
//						ZoneId: *pulumi.String(selected.HostedZoneId),
//					},
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
// ### CloudFront Origin
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cloudfront"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/s3"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			selected, err := s3.LookupBucket(ctx, &s3.LookupBucketArgs{
//				Bucket: "a-test-bucket",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = cloudfront.NewDistribution(ctx, "test", &cloudfront.DistributionArgs{
//				Origins: cloudfront.DistributionOriginArray{
//					&cloudfront.DistributionOriginArgs{
//						DomainName: *pulumi.String(selected.BucketDomainName),
//						OriginId:   pulumi.String("s3-selected-bucket"),
//					},
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
func LookupBucket(ctx *pulumi.Context, args *LookupBucketArgs, opts ...pulumi.InvokeOption) (*LookupBucketResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupBucketResult
	err := ctx.Invoke("aws:s3/getBucket:getBucket", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBucket.
type LookupBucketArgs struct {
	// Name of the bucket
	Bucket string `pulumi:"bucket"`
}

// A collection of values returned by getBucket.
type LookupBucketResult struct {
	// ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
	Arn    string `pulumi:"arn"`
	Bucket string `pulumi:"bucket"`
	// Bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
	BucketDomainName string `pulumi:"bucketDomainName"`
	// The bucket region-specific domain name. The bucket domain name including the region name. Please refer to the [S3 endpoints reference](https://docs.aws.amazon.com/general/latest/gr/s3.html#s3_region) for format. Note: AWS CloudFront allows specifying an S3 region-specific endpoint when creating an S3 origin. This will prevent redirect issues from CloudFront to the S3 Origin URL. For more information, see the [Virtual Hosted-Style Requests for Other Regions](https://docs.aws.amazon.com/AmazonS3/latest/userguide/VirtualHosting.html#deprecated-global-endpoint) section in the AWS S3 User Guide.
	BucketRegionalDomainName string `pulumi:"bucketRegionalDomainName"`
	// The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
	HostedZoneId string `pulumi:"hostedZoneId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// AWS region this bucket resides in.
	Region string `pulumi:"region"`
	// Domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
	WebsiteDomain string `pulumi:"websiteDomain"`
	// Website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
	WebsiteEndpoint string `pulumi:"websiteEndpoint"`
}

func LookupBucketOutput(ctx *pulumi.Context, args LookupBucketOutputArgs, opts ...pulumi.InvokeOption) LookupBucketResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupBucketResult, error) {
			args := v.(LookupBucketArgs)
			r, err := LookupBucket(ctx, &args, opts...)
			var s LookupBucketResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupBucketResultOutput)
}

// A collection of arguments for invoking getBucket.
type LookupBucketOutputArgs struct {
	// Name of the bucket
	Bucket pulumi.StringInput `pulumi:"bucket"`
}

func (LookupBucketOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBucketArgs)(nil)).Elem()
}

// A collection of values returned by getBucket.
type LookupBucketResultOutput struct{ *pulumi.OutputState }

func (LookupBucketResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBucketResult)(nil)).Elem()
}

func (o LookupBucketResultOutput) ToLookupBucketResultOutput() LookupBucketResultOutput {
	return o
}

func (o LookupBucketResultOutput) ToLookupBucketResultOutputWithContext(ctx context.Context) LookupBucketResultOutput {
	return o
}

// ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
func (o LookupBucketResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBucketResult) string { return v.Arn }).(pulumi.StringOutput)
}

func (o LookupBucketResultOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBucketResult) string { return v.Bucket }).(pulumi.StringOutput)
}

// Bucket domain name. Will be of format `bucketname.s3.amazonaws.com`.
func (o LookupBucketResultOutput) BucketDomainName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBucketResult) string { return v.BucketDomainName }).(pulumi.StringOutput)
}

// The bucket region-specific domain name. The bucket domain name including the region name. Please refer to the [S3 endpoints reference](https://docs.aws.amazon.com/general/latest/gr/s3.html#s3_region) for format. Note: AWS CloudFront allows specifying an S3 region-specific endpoint when creating an S3 origin. This will prevent redirect issues from CloudFront to the S3 Origin URL. For more information, see the [Virtual Hosted-Style Requests for Other Regions](https://docs.aws.amazon.com/AmazonS3/latest/userguide/VirtualHosting.html#deprecated-global-endpoint) section in the AWS S3 User Guide.
func (o LookupBucketResultOutput) BucketRegionalDomainName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBucketResult) string { return v.BucketRegionalDomainName }).(pulumi.StringOutput)
}

// The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
func (o LookupBucketResultOutput) HostedZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBucketResult) string { return v.HostedZoneId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupBucketResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBucketResult) string { return v.Id }).(pulumi.StringOutput)
}

// AWS region this bucket resides in.
func (o LookupBucketResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBucketResult) string { return v.Region }).(pulumi.StringOutput)
}

// Domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
func (o LookupBucketResultOutput) WebsiteDomain() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBucketResult) string { return v.WebsiteDomain }).(pulumi.StringOutput)
}

// Website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
func (o LookupBucketResultOutput) WebsiteEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBucketResult) string { return v.WebsiteEndpoint }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBucketResultOutput{})
}
