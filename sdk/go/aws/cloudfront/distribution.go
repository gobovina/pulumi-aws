// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudfront

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates an Amazon CloudFront web distribution.
//
// For information about CloudFront distributions, see the
// [Amazon CloudFront Developer Guide](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Introduction.html). For specific information about creating
// CloudFront web distributions, see the [POST Distribution](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CreateDistribution.html) page in the Amazon
// CloudFront API Reference.
//
// > **NOTE:** CloudFront distributions take about 15 minutes to reach a deployed
// state after creation or modification. During this time, deletes to resources will
// be blocked. If you need to delete a distribution that is enabled and you do not
// want to wait, you need to use the `retainOnDelete` flag.
//
// ## Example Usage
//
// The following example below creates a CloudFront distribution with an S3 origin.
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/cloudfront"
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/s3"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		bucketV2, err := s3.NewBucketV2(ctx, "bucketV2", &s3.BucketV2Args{
// 			Tags: pulumi.StringMap{
// 				"Name": pulumi.String("My bucket"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = s3.NewBucketAclV2(ctx, "bAcl", &s3.BucketAclV2Args{
// 			Bucket: bucketV2.ID(),
// 			Acl:    pulumi.String("private"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		s3OriginId := "myS3Origin"
// 		_, err = cloudfront.NewDistribution(ctx, "s3Distribution", &cloudfront.DistributionArgs{
// 			Origins: cloudfront.DistributionOriginArray{
// 				&cloudfront.DistributionOriginArgs{
// 					DomainName: bucketV2.BucketRegionalDomainName,
// 					OriginId:   pulumi.String(s3OriginId),
// 					S3OriginConfig: &cloudfront.DistributionOriginS3OriginConfigArgs{
// 						OriginAccessIdentity: pulumi.String("origin-access-identity/cloudfront/ABCDEFG1234567"),
// 					},
// 				},
// 			},
// 			Enabled:           pulumi.Bool(true),
// 			IsIpv6Enabled:     pulumi.Bool(true),
// 			Comment:           pulumi.String("Some comment"),
// 			DefaultRootObject: pulumi.String("index.html"),
// 			LoggingConfig: &cloudfront.DistributionLoggingConfigArgs{
// 				IncludeCookies: pulumi.Bool(false),
// 				Bucket:         pulumi.String("mylogs.s3.amazonaws.com"),
// 				Prefix:         pulumi.String("myprefix"),
// 			},
// 			Aliases: pulumi.StringArray{
// 				pulumi.String("mysite.example.com"),
// 				pulumi.String("yoursite.example.com"),
// 			},
// 			DefaultCacheBehavior: &cloudfront.DistributionDefaultCacheBehaviorArgs{
// 				AllowedMethods: pulumi.StringArray{
// 					pulumi.String("DELETE"),
// 					pulumi.String("GET"),
// 					pulumi.String("HEAD"),
// 					pulumi.String("OPTIONS"),
// 					pulumi.String("PATCH"),
// 					pulumi.String("POST"),
// 					pulumi.String("PUT"),
// 				},
// 				CachedMethods: pulumi.StringArray{
// 					pulumi.String("GET"),
// 					pulumi.String("HEAD"),
// 				},
// 				TargetOriginId: pulumi.String(s3OriginId),
// 				ForwardedValues: &cloudfront.DistributionDefaultCacheBehaviorForwardedValuesArgs{
// 					QueryString: pulumi.Bool(false),
// 					Cookies: &cloudfront.DistributionDefaultCacheBehaviorForwardedValuesCookiesArgs{
// 						Forward: pulumi.String("none"),
// 					},
// 				},
// 				ViewerProtocolPolicy: pulumi.String("allow-all"),
// 				MinTtl:               pulumi.Int(0),
// 				DefaultTtl:           pulumi.Int(3600),
// 				MaxTtl:               pulumi.Int(86400),
// 			},
// 			OrderedCacheBehaviors: cloudfront.DistributionOrderedCacheBehaviorArray{
// 				&cloudfront.DistributionOrderedCacheBehaviorArgs{
// 					PathPattern: pulumi.String("/content/immutable/*"),
// 					AllowedMethods: pulumi.StringArray{
// 						pulumi.String("GET"),
// 						pulumi.String("HEAD"),
// 						pulumi.String("OPTIONS"),
// 					},
// 					CachedMethods: pulumi.StringArray{
// 						pulumi.String("GET"),
// 						pulumi.String("HEAD"),
// 						pulumi.String("OPTIONS"),
// 					},
// 					TargetOriginId: pulumi.String(s3OriginId),
// 					ForwardedValues: &cloudfront.DistributionOrderedCacheBehaviorForwardedValuesArgs{
// 						QueryString: pulumi.Bool(false),
// 						Headers: pulumi.StringArray{
// 							pulumi.String("Origin"),
// 						},
// 						Cookies: &cloudfront.DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs{
// 							Forward: pulumi.String("none"),
// 						},
// 					},
// 					MinTtl:               pulumi.Int(0),
// 					DefaultTtl:           pulumi.Int(86400),
// 					MaxTtl:               pulumi.Int(31536000),
// 					Compress:             pulumi.Bool(true),
// 					ViewerProtocolPolicy: pulumi.String("redirect-to-https"),
// 				},
// 				&cloudfront.DistributionOrderedCacheBehaviorArgs{
// 					PathPattern: pulumi.String("/content/*"),
// 					AllowedMethods: pulumi.StringArray{
// 						pulumi.String("GET"),
// 						pulumi.String("HEAD"),
// 						pulumi.String("OPTIONS"),
// 					},
// 					CachedMethods: pulumi.StringArray{
// 						pulumi.String("GET"),
// 						pulumi.String("HEAD"),
// 					},
// 					TargetOriginId: pulumi.String(s3OriginId),
// 					ForwardedValues: &cloudfront.DistributionOrderedCacheBehaviorForwardedValuesArgs{
// 						QueryString: pulumi.Bool(false),
// 						Cookies: &cloudfront.DistributionOrderedCacheBehaviorForwardedValuesCookiesArgs{
// 							Forward: pulumi.String("none"),
// 						},
// 					},
// 					MinTtl:               pulumi.Int(0),
// 					DefaultTtl:           pulumi.Int(3600),
// 					MaxTtl:               pulumi.Int(86400),
// 					Compress:             pulumi.Bool(true),
// 					ViewerProtocolPolicy: pulumi.String("redirect-to-https"),
// 				},
// 			},
// 			PriceClass: pulumi.String("PriceClass_200"),
// 			Restrictions: &cloudfront.DistributionRestrictionsArgs{
// 				GeoRestriction: &cloudfront.DistributionRestrictionsGeoRestrictionArgs{
// 					RestrictionType: pulumi.String("whitelist"),
// 					Locations: pulumi.StringArray{
// 						pulumi.String("US"),
// 						pulumi.String("CA"),
// 						pulumi.String("GB"),
// 						pulumi.String("DE"),
// 					},
// 				},
// 			},
// 			Tags: pulumi.StringMap{
// 				"Environment": pulumi.String("production"),
// 			},
// 			ViewerCertificate: &cloudfront.DistributionViewerCertificateArgs{
// 				CloudfrontDefaultCertificate: pulumi.Bool(true),
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
// The following example below creates a Cloudfront distribution with an origin group for failover routing:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/cloudfront"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudfront.NewDistribution(ctx, "s3Distribution", &cloudfront.DistributionArgs{
// 			OriginGroups: cloudfront.DistributionOriginGroupArray{
// 				&cloudfront.DistributionOriginGroupArgs{
// 					OriginId: pulumi.String("groupS3"),
// 					FailoverCriteria: &cloudfront.DistributionOriginGroupFailoverCriteriaArgs{
// 						StatusCodes: pulumi.IntArray{
// 							pulumi.Int(403),
// 							pulumi.Int(404),
// 							pulumi.Int(500),
// 							pulumi.Int(502),
// 						},
// 					},
// 					Members: cloudfront.DistributionOriginGroupMemberArray{
// 						&cloudfront.DistributionOriginGroupMemberArgs{
// 							OriginId: pulumi.String("primaryS3"),
// 						},
// 						&cloudfront.DistributionOriginGroupMemberArgs{
// 							OriginId: pulumi.String("failoverS3"),
// 						},
// 					},
// 				},
// 			},
// 			Origins: cloudfront.DistributionOriginArray{
// 				&cloudfront.DistributionOriginArgs{
// 					DomainName: pulumi.Any(aws_s3_bucket.Primary.Bucket_regional_domain_name),
// 					OriginId:   pulumi.String("primaryS3"),
// 					S3OriginConfig: &cloudfront.DistributionOriginS3OriginConfigArgs{
// 						OriginAccessIdentity: pulumi.Any(aws_cloudfront_origin_access_identity.Default.Cloudfront_access_identity_path),
// 					},
// 				},
// 				&cloudfront.DistributionOriginArgs{
// 					DomainName: pulumi.Any(aws_s3_bucket.Failover.Bucket_regional_domain_name),
// 					OriginId:   pulumi.String("failoverS3"),
// 					S3OriginConfig: &cloudfront.DistributionOriginS3OriginConfigArgs{
// 						OriginAccessIdentity: pulumi.Any(aws_cloudfront_origin_access_identity.Default.Cloudfront_access_identity_path),
// 					},
// 				},
// 			},
// 			DefaultCacheBehavior: &cloudfront.DistributionDefaultCacheBehaviorArgs{
// 				TargetOriginId: pulumi.String("groupS3"),
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
// Cloudfront Distributions can be imported using the `id`, e.g.,
//
// ```sh
//  $ pulumi import aws:cloudfront/distribution:Distribution distribution E74FTE3EXAMPLE
// ```
type Distribution struct {
	pulumi.CustomResourceState

	// Extra CNAMEs (alternate domain names), if any, for
	// this distribution.
	Aliases pulumi.StringArrayOutput `pulumi:"aliases"`
	// The ARN (Amazon Resource Name) for the distribution. For example: `arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5`, where `123456789012` is your AWS account ID.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Internal value used by CloudFront to allow future
	// updates to the distribution configuration.
	CallerReference pulumi.StringOutput `pulumi:"callerReference"`
	// Any comments you want to include about the
	// distribution.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// One or more custom error response elements (multiples allowed).
	CustomErrorResponses DistributionCustomErrorResponseArrayOutput `pulumi:"customErrorResponses"`
	// The default cache behavior for this distribution (maximum
	// one).
	DefaultCacheBehavior DistributionDefaultCacheBehaviorOutput `pulumi:"defaultCacheBehavior"`
	// The object that you want CloudFront to
	// return (for example, index.html) when an end user requests the root URL.
	DefaultRootObject pulumi.StringPtrOutput `pulumi:"defaultRootObject"`
	// The DNS domain name of either the S3 bucket, or
	// web site of your custom origin.
	DomainName pulumi.StringOutput `pulumi:"domainName"`
	// A flag that specifies whether Origin Shield is enabled.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The current version of the distribution's information. For example:
	// `E2QWRUHAPOMQZL`.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// The CloudFront Route 53 zone ID that can be used to
	// route an [Alias Resource Record Set](http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html) to. This attribute is simply an
	// alias for the zone ID `Z2FDTNDATAQYW2`.
	HostedZoneId pulumi.StringOutput `pulumi:"hostedZoneId"`
	// The maximum HTTP version to support on the
	// distribution. Allowed values are `http1.1` and `http2`. The default is
	// `http2`.
	HttpVersion pulumi.StringPtrOutput `pulumi:"httpVersion"`
	// The number of invalidation batches
	// currently in progress.
	InProgressValidationBatches pulumi.IntOutput `pulumi:"inProgressValidationBatches"`
	// Whether the IPv6 is enabled for the distribution.
	IsIpv6Enabled pulumi.BoolPtrOutput `pulumi:"isIpv6Enabled"`
	// The date and time the distribution was last modified.
	LastModifiedTime pulumi.StringOutput `pulumi:"lastModifiedTime"`
	// The logging
	// configuration that controls how logs are written
	// to your distribution (maximum one).
	LoggingConfig DistributionLoggingConfigPtrOutput `pulumi:"loggingConfig"`
	// An ordered list of cache behaviors
	// resource for this distribution. List from top to bottom
	// in order of precedence. The topmost cache behavior will have precedence 0.
	OrderedCacheBehaviors DistributionOrderedCacheBehaviorArrayOutput `pulumi:"orderedCacheBehaviors"`
	// One or more originGroup for this
	// distribution (multiples allowed).
	OriginGroups DistributionOriginGroupArrayOutput `pulumi:"originGroups"`
	// One or more origins for this
	// distribution (multiples allowed).
	Origins DistributionOriginArrayOutput `pulumi:"origins"`
	// The price class for this distribution. One of
	// `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
	PriceClass pulumi.StringPtrOutput `pulumi:"priceClass"`
	// The restriction
	// configuration for this distribution (maximum one).
	Restrictions DistributionRestrictionsOutput `pulumi:"restrictions"`
	// Disables the distribution instead of
	// deleting it when destroying the resource. If this is set,
	// the distribution needs to be deleted manually afterwards. Default: `false`.
	RetainOnDelete pulumi.BoolPtrOutput `pulumi:"retainOnDelete"`
	// The current status of the distribution. `Deployed` if the
	// distribution's information is fully propagated throughout the Amazon
	// CloudFront system.
	Status pulumi.StringOutput `pulumi:"status"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider .
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// A list of key group IDs that CloudFront can use to validate signed URLs or signed cookies.
	// See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
	TrustedKeyGroups DistributionTrustedKeyGroupArrayOutput `pulumi:"trustedKeyGroups"`
	// List of AWS account IDs (or `self`) that you want to allow to create signed URLs for private content.
	// See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
	TrustedSigners DistributionTrustedSignerArrayOutput `pulumi:"trustedSigners"`
	// The SSL
	// configuration for this distribution (maximum
	// one).
	ViewerCertificate DistributionViewerCertificateOutput `pulumi:"viewerCertificate"`
	// If enabled, the resource will wait for
	// the distribution status to change from `InProgress` to `Deployed`. Setting
	// this to`false` will skip the process. Default: `true`.
	WaitForDeployment pulumi.BoolPtrOutput `pulumi:"waitForDeployment"`
	// A unique identifier that specifies the AWS WAF web ACL,
	// if any, to associate with this distribution.
	// To specify a web ACL created using the latest version of AWS WAF (WAFv2), use the ACL ARN,
	// for example `aws_wafv2_web_acl.example.arn`. To specify a web
	// ACL created using AWS WAF Classic, use the ACL ID, for example `aws_waf_web_acl.example.id`.
	// The WAF Web ACL must exist in the WAF Global (CloudFront) region and the
	// credentials configuring this argument must have `waf:GetWebACL` permissions assigned.
	WebAclId pulumi.StringPtrOutput `pulumi:"webAclId"`
}

// NewDistribution registers a new resource with the given unique name, arguments, and options.
func NewDistribution(ctx *pulumi.Context,
	name string, args *DistributionArgs, opts ...pulumi.ResourceOption) (*Distribution, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DefaultCacheBehavior == nil {
		return nil, errors.New("invalid value for required argument 'DefaultCacheBehavior'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.Origins == nil {
		return nil, errors.New("invalid value for required argument 'Origins'")
	}
	if args.Restrictions == nil {
		return nil, errors.New("invalid value for required argument 'Restrictions'")
	}
	if args.ViewerCertificate == nil {
		return nil, errors.New("invalid value for required argument 'ViewerCertificate'")
	}
	var resource Distribution
	err := ctx.RegisterResource("aws:cloudfront/distribution:Distribution", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDistribution gets an existing Distribution resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDistribution(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DistributionState, opts ...pulumi.ResourceOption) (*Distribution, error) {
	var resource Distribution
	err := ctx.ReadResource("aws:cloudfront/distribution:Distribution", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Distribution resources.
type distributionState struct {
	// Extra CNAMEs (alternate domain names), if any, for
	// this distribution.
	Aliases []string `pulumi:"aliases"`
	// The ARN (Amazon Resource Name) for the distribution. For example: `arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5`, where `123456789012` is your AWS account ID.
	Arn *string `pulumi:"arn"`
	// Internal value used by CloudFront to allow future
	// updates to the distribution configuration.
	CallerReference *string `pulumi:"callerReference"`
	// Any comments you want to include about the
	// distribution.
	Comment *string `pulumi:"comment"`
	// One or more custom error response elements (multiples allowed).
	CustomErrorResponses []DistributionCustomErrorResponse `pulumi:"customErrorResponses"`
	// The default cache behavior for this distribution (maximum
	// one).
	DefaultCacheBehavior *DistributionDefaultCacheBehavior `pulumi:"defaultCacheBehavior"`
	// The object that you want CloudFront to
	// return (for example, index.html) when an end user requests the root URL.
	DefaultRootObject *string `pulumi:"defaultRootObject"`
	// The DNS domain name of either the S3 bucket, or
	// web site of your custom origin.
	DomainName *string `pulumi:"domainName"`
	// A flag that specifies whether Origin Shield is enabled.
	Enabled *bool `pulumi:"enabled"`
	// The current version of the distribution's information. For example:
	// `E2QWRUHAPOMQZL`.
	Etag *string `pulumi:"etag"`
	// The CloudFront Route 53 zone ID that can be used to
	// route an [Alias Resource Record Set](http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html) to. This attribute is simply an
	// alias for the zone ID `Z2FDTNDATAQYW2`.
	HostedZoneId *string `pulumi:"hostedZoneId"`
	// The maximum HTTP version to support on the
	// distribution. Allowed values are `http1.1` and `http2`. The default is
	// `http2`.
	HttpVersion *string `pulumi:"httpVersion"`
	// The number of invalidation batches
	// currently in progress.
	InProgressValidationBatches *int `pulumi:"inProgressValidationBatches"`
	// Whether the IPv6 is enabled for the distribution.
	IsIpv6Enabled *bool `pulumi:"isIpv6Enabled"`
	// The date and time the distribution was last modified.
	LastModifiedTime *string `pulumi:"lastModifiedTime"`
	// The logging
	// configuration that controls how logs are written
	// to your distribution (maximum one).
	LoggingConfig *DistributionLoggingConfig `pulumi:"loggingConfig"`
	// An ordered list of cache behaviors
	// resource for this distribution. List from top to bottom
	// in order of precedence. The topmost cache behavior will have precedence 0.
	OrderedCacheBehaviors []DistributionOrderedCacheBehavior `pulumi:"orderedCacheBehaviors"`
	// One or more originGroup for this
	// distribution (multiples allowed).
	OriginGroups []DistributionOriginGroup `pulumi:"originGroups"`
	// One or more origins for this
	// distribution (multiples allowed).
	Origins []DistributionOrigin `pulumi:"origins"`
	// The price class for this distribution. One of
	// `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
	PriceClass *string `pulumi:"priceClass"`
	// The restriction
	// configuration for this distribution (maximum one).
	Restrictions *DistributionRestrictions `pulumi:"restrictions"`
	// Disables the distribution instead of
	// deleting it when destroying the resource. If this is set,
	// the distribution needs to be deleted manually afterwards. Default: `false`.
	RetainOnDelete *bool `pulumi:"retainOnDelete"`
	// The current status of the distribution. `Deployed` if the
	// distribution's information is fully propagated throughout the Amazon
	// CloudFront system.
	Status *string `pulumi:"status"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider .
	TagsAll map[string]string `pulumi:"tagsAll"`
	// A list of key group IDs that CloudFront can use to validate signed URLs or signed cookies.
	// See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
	TrustedKeyGroups []DistributionTrustedKeyGroup `pulumi:"trustedKeyGroups"`
	// List of AWS account IDs (or `self`) that you want to allow to create signed URLs for private content.
	// See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
	TrustedSigners []DistributionTrustedSigner `pulumi:"trustedSigners"`
	// The SSL
	// configuration for this distribution (maximum
	// one).
	ViewerCertificate *DistributionViewerCertificate `pulumi:"viewerCertificate"`
	// If enabled, the resource will wait for
	// the distribution status to change from `InProgress` to `Deployed`. Setting
	// this to`false` will skip the process. Default: `true`.
	WaitForDeployment *bool `pulumi:"waitForDeployment"`
	// A unique identifier that specifies the AWS WAF web ACL,
	// if any, to associate with this distribution.
	// To specify a web ACL created using the latest version of AWS WAF (WAFv2), use the ACL ARN,
	// for example `aws_wafv2_web_acl.example.arn`. To specify a web
	// ACL created using AWS WAF Classic, use the ACL ID, for example `aws_waf_web_acl.example.id`.
	// The WAF Web ACL must exist in the WAF Global (CloudFront) region and the
	// credentials configuring this argument must have `waf:GetWebACL` permissions assigned.
	WebAclId *string `pulumi:"webAclId"`
}

type DistributionState struct {
	// Extra CNAMEs (alternate domain names), if any, for
	// this distribution.
	Aliases pulumi.StringArrayInput
	// The ARN (Amazon Resource Name) for the distribution. For example: `arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5`, where `123456789012` is your AWS account ID.
	Arn pulumi.StringPtrInput
	// Internal value used by CloudFront to allow future
	// updates to the distribution configuration.
	CallerReference pulumi.StringPtrInput
	// Any comments you want to include about the
	// distribution.
	Comment pulumi.StringPtrInput
	// One or more custom error response elements (multiples allowed).
	CustomErrorResponses DistributionCustomErrorResponseArrayInput
	// The default cache behavior for this distribution (maximum
	// one).
	DefaultCacheBehavior DistributionDefaultCacheBehaviorPtrInput
	// The object that you want CloudFront to
	// return (for example, index.html) when an end user requests the root URL.
	DefaultRootObject pulumi.StringPtrInput
	// The DNS domain name of either the S3 bucket, or
	// web site of your custom origin.
	DomainName pulumi.StringPtrInput
	// A flag that specifies whether Origin Shield is enabled.
	Enabled pulumi.BoolPtrInput
	// The current version of the distribution's information. For example:
	// `E2QWRUHAPOMQZL`.
	Etag pulumi.StringPtrInput
	// The CloudFront Route 53 zone ID that can be used to
	// route an [Alias Resource Record Set](http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html) to. This attribute is simply an
	// alias for the zone ID `Z2FDTNDATAQYW2`.
	HostedZoneId pulumi.StringPtrInput
	// The maximum HTTP version to support on the
	// distribution. Allowed values are `http1.1` and `http2`. The default is
	// `http2`.
	HttpVersion pulumi.StringPtrInput
	// The number of invalidation batches
	// currently in progress.
	InProgressValidationBatches pulumi.IntPtrInput
	// Whether the IPv6 is enabled for the distribution.
	IsIpv6Enabled pulumi.BoolPtrInput
	// The date and time the distribution was last modified.
	LastModifiedTime pulumi.StringPtrInput
	// The logging
	// configuration that controls how logs are written
	// to your distribution (maximum one).
	LoggingConfig DistributionLoggingConfigPtrInput
	// An ordered list of cache behaviors
	// resource for this distribution. List from top to bottom
	// in order of precedence. The topmost cache behavior will have precedence 0.
	OrderedCacheBehaviors DistributionOrderedCacheBehaviorArrayInput
	// One or more originGroup for this
	// distribution (multiples allowed).
	OriginGroups DistributionOriginGroupArrayInput
	// One or more origins for this
	// distribution (multiples allowed).
	Origins DistributionOriginArrayInput
	// The price class for this distribution. One of
	// `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
	PriceClass pulumi.StringPtrInput
	// The restriction
	// configuration for this distribution (maximum one).
	Restrictions DistributionRestrictionsPtrInput
	// Disables the distribution instead of
	// deleting it when destroying the resource. If this is set,
	// the distribution needs to be deleted manually afterwards. Default: `false`.
	RetainOnDelete pulumi.BoolPtrInput
	// The current status of the distribution. `Deployed` if the
	// distribution's information is fully propagated throughout the Amazon
	// CloudFront system.
	Status pulumi.StringPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider .
	TagsAll pulumi.StringMapInput
	// A list of key group IDs that CloudFront can use to validate signed URLs or signed cookies.
	// See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
	TrustedKeyGroups DistributionTrustedKeyGroupArrayInput
	// List of AWS account IDs (or `self`) that you want to allow to create signed URLs for private content.
	// See the [CloudFront User Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-trusted-signers.html) for more information about this feature.
	TrustedSigners DistributionTrustedSignerArrayInput
	// The SSL
	// configuration for this distribution (maximum
	// one).
	ViewerCertificate DistributionViewerCertificatePtrInput
	// If enabled, the resource will wait for
	// the distribution status to change from `InProgress` to `Deployed`. Setting
	// this to`false` will skip the process. Default: `true`.
	WaitForDeployment pulumi.BoolPtrInput
	// A unique identifier that specifies the AWS WAF web ACL,
	// if any, to associate with this distribution.
	// To specify a web ACL created using the latest version of AWS WAF (WAFv2), use the ACL ARN,
	// for example `aws_wafv2_web_acl.example.arn`. To specify a web
	// ACL created using AWS WAF Classic, use the ACL ID, for example `aws_waf_web_acl.example.id`.
	// The WAF Web ACL must exist in the WAF Global (CloudFront) region and the
	// credentials configuring this argument must have `waf:GetWebACL` permissions assigned.
	WebAclId pulumi.StringPtrInput
}

func (DistributionState) ElementType() reflect.Type {
	return reflect.TypeOf((*distributionState)(nil)).Elem()
}

type distributionArgs struct {
	// Extra CNAMEs (alternate domain names), if any, for
	// this distribution.
	Aliases []string `pulumi:"aliases"`
	// Any comments you want to include about the
	// distribution.
	Comment *string `pulumi:"comment"`
	// One or more custom error response elements (multiples allowed).
	CustomErrorResponses []DistributionCustomErrorResponse `pulumi:"customErrorResponses"`
	// The default cache behavior for this distribution (maximum
	// one).
	DefaultCacheBehavior DistributionDefaultCacheBehavior `pulumi:"defaultCacheBehavior"`
	// The object that you want CloudFront to
	// return (for example, index.html) when an end user requests the root URL.
	DefaultRootObject *string `pulumi:"defaultRootObject"`
	// A flag that specifies whether Origin Shield is enabled.
	Enabled bool `pulumi:"enabled"`
	// The maximum HTTP version to support on the
	// distribution. Allowed values are `http1.1` and `http2`. The default is
	// `http2`.
	HttpVersion *string `pulumi:"httpVersion"`
	// Whether the IPv6 is enabled for the distribution.
	IsIpv6Enabled *bool `pulumi:"isIpv6Enabled"`
	// The logging
	// configuration that controls how logs are written
	// to your distribution (maximum one).
	LoggingConfig *DistributionLoggingConfig `pulumi:"loggingConfig"`
	// An ordered list of cache behaviors
	// resource for this distribution. List from top to bottom
	// in order of precedence. The topmost cache behavior will have precedence 0.
	OrderedCacheBehaviors []DistributionOrderedCacheBehavior `pulumi:"orderedCacheBehaviors"`
	// One or more originGroup for this
	// distribution (multiples allowed).
	OriginGroups []DistributionOriginGroup `pulumi:"originGroups"`
	// One or more origins for this
	// distribution (multiples allowed).
	Origins []DistributionOrigin `pulumi:"origins"`
	// The price class for this distribution. One of
	// `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
	PriceClass *string `pulumi:"priceClass"`
	// The restriction
	// configuration for this distribution (maximum one).
	Restrictions DistributionRestrictions `pulumi:"restrictions"`
	// Disables the distribution instead of
	// deleting it when destroying the resource. If this is set,
	// the distribution needs to be deleted manually afterwards. Default: `false`.
	RetainOnDelete *bool `pulumi:"retainOnDelete"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The SSL
	// configuration for this distribution (maximum
	// one).
	ViewerCertificate DistributionViewerCertificate `pulumi:"viewerCertificate"`
	// If enabled, the resource will wait for
	// the distribution status to change from `InProgress` to `Deployed`. Setting
	// this to`false` will skip the process. Default: `true`.
	WaitForDeployment *bool `pulumi:"waitForDeployment"`
	// A unique identifier that specifies the AWS WAF web ACL,
	// if any, to associate with this distribution.
	// To specify a web ACL created using the latest version of AWS WAF (WAFv2), use the ACL ARN,
	// for example `aws_wafv2_web_acl.example.arn`. To specify a web
	// ACL created using AWS WAF Classic, use the ACL ID, for example `aws_waf_web_acl.example.id`.
	// The WAF Web ACL must exist in the WAF Global (CloudFront) region and the
	// credentials configuring this argument must have `waf:GetWebACL` permissions assigned.
	WebAclId *string `pulumi:"webAclId"`
}

// The set of arguments for constructing a Distribution resource.
type DistributionArgs struct {
	// Extra CNAMEs (alternate domain names), if any, for
	// this distribution.
	Aliases pulumi.StringArrayInput
	// Any comments you want to include about the
	// distribution.
	Comment pulumi.StringPtrInput
	// One or more custom error response elements (multiples allowed).
	CustomErrorResponses DistributionCustomErrorResponseArrayInput
	// The default cache behavior for this distribution (maximum
	// one).
	DefaultCacheBehavior DistributionDefaultCacheBehaviorInput
	// The object that you want CloudFront to
	// return (for example, index.html) when an end user requests the root URL.
	DefaultRootObject pulumi.StringPtrInput
	// A flag that specifies whether Origin Shield is enabled.
	Enabled pulumi.BoolInput
	// The maximum HTTP version to support on the
	// distribution. Allowed values are `http1.1` and `http2`. The default is
	// `http2`.
	HttpVersion pulumi.StringPtrInput
	// Whether the IPv6 is enabled for the distribution.
	IsIpv6Enabled pulumi.BoolPtrInput
	// The logging
	// configuration that controls how logs are written
	// to your distribution (maximum one).
	LoggingConfig DistributionLoggingConfigPtrInput
	// An ordered list of cache behaviors
	// resource for this distribution. List from top to bottom
	// in order of precedence. The topmost cache behavior will have precedence 0.
	OrderedCacheBehaviors DistributionOrderedCacheBehaviorArrayInput
	// One or more originGroup for this
	// distribution (multiples allowed).
	OriginGroups DistributionOriginGroupArrayInput
	// One or more origins for this
	// distribution (multiples allowed).
	Origins DistributionOriginArrayInput
	// The price class for this distribution. One of
	// `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
	PriceClass pulumi.StringPtrInput
	// The restriction
	// configuration for this distribution (maximum one).
	Restrictions DistributionRestrictionsInput
	// Disables the distribution instead of
	// deleting it when destroying the resource. If this is set,
	// the distribution needs to be deleted manually afterwards. Default: `false`.
	RetainOnDelete pulumi.BoolPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The SSL
	// configuration for this distribution (maximum
	// one).
	ViewerCertificate DistributionViewerCertificateInput
	// If enabled, the resource will wait for
	// the distribution status to change from `InProgress` to `Deployed`. Setting
	// this to`false` will skip the process. Default: `true`.
	WaitForDeployment pulumi.BoolPtrInput
	// A unique identifier that specifies the AWS WAF web ACL,
	// if any, to associate with this distribution.
	// To specify a web ACL created using the latest version of AWS WAF (WAFv2), use the ACL ARN,
	// for example `aws_wafv2_web_acl.example.arn`. To specify a web
	// ACL created using AWS WAF Classic, use the ACL ID, for example `aws_waf_web_acl.example.id`.
	// The WAF Web ACL must exist in the WAF Global (CloudFront) region and the
	// credentials configuring this argument must have `waf:GetWebACL` permissions assigned.
	WebAclId pulumi.StringPtrInput
}

func (DistributionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*distributionArgs)(nil)).Elem()
}

type DistributionInput interface {
	pulumi.Input

	ToDistributionOutput() DistributionOutput
	ToDistributionOutputWithContext(ctx context.Context) DistributionOutput
}

func (*Distribution) ElementType() reflect.Type {
	return reflect.TypeOf((**Distribution)(nil)).Elem()
}

func (i *Distribution) ToDistributionOutput() DistributionOutput {
	return i.ToDistributionOutputWithContext(context.Background())
}

func (i *Distribution) ToDistributionOutputWithContext(ctx context.Context) DistributionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DistributionOutput)
}

// DistributionArrayInput is an input type that accepts DistributionArray and DistributionArrayOutput values.
// You can construct a concrete instance of `DistributionArrayInput` via:
//
//          DistributionArray{ DistributionArgs{...} }
type DistributionArrayInput interface {
	pulumi.Input

	ToDistributionArrayOutput() DistributionArrayOutput
	ToDistributionArrayOutputWithContext(context.Context) DistributionArrayOutput
}

type DistributionArray []DistributionInput

func (DistributionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Distribution)(nil)).Elem()
}

func (i DistributionArray) ToDistributionArrayOutput() DistributionArrayOutput {
	return i.ToDistributionArrayOutputWithContext(context.Background())
}

func (i DistributionArray) ToDistributionArrayOutputWithContext(ctx context.Context) DistributionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DistributionArrayOutput)
}

// DistributionMapInput is an input type that accepts DistributionMap and DistributionMapOutput values.
// You can construct a concrete instance of `DistributionMapInput` via:
//
//          DistributionMap{ "key": DistributionArgs{...} }
type DistributionMapInput interface {
	pulumi.Input

	ToDistributionMapOutput() DistributionMapOutput
	ToDistributionMapOutputWithContext(context.Context) DistributionMapOutput
}

type DistributionMap map[string]DistributionInput

func (DistributionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Distribution)(nil)).Elem()
}

func (i DistributionMap) ToDistributionMapOutput() DistributionMapOutput {
	return i.ToDistributionMapOutputWithContext(context.Background())
}

func (i DistributionMap) ToDistributionMapOutputWithContext(ctx context.Context) DistributionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DistributionMapOutput)
}

type DistributionOutput struct{ *pulumi.OutputState }

func (DistributionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Distribution)(nil)).Elem()
}

func (o DistributionOutput) ToDistributionOutput() DistributionOutput {
	return o
}

func (o DistributionOutput) ToDistributionOutputWithContext(ctx context.Context) DistributionOutput {
	return o
}

type DistributionArrayOutput struct{ *pulumi.OutputState }

func (DistributionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Distribution)(nil)).Elem()
}

func (o DistributionArrayOutput) ToDistributionArrayOutput() DistributionArrayOutput {
	return o
}

func (o DistributionArrayOutput) ToDistributionArrayOutputWithContext(ctx context.Context) DistributionArrayOutput {
	return o
}

func (o DistributionArrayOutput) Index(i pulumi.IntInput) DistributionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Distribution {
		return vs[0].([]*Distribution)[vs[1].(int)]
	}).(DistributionOutput)
}

type DistributionMapOutput struct{ *pulumi.OutputState }

func (DistributionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Distribution)(nil)).Elem()
}

func (o DistributionMapOutput) ToDistributionMapOutput() DistributionMapOutput {
	return o
}

func (o DistributionMapOutput) ToDistributionMapOutputWithContext(ctx context.Context) DistributionMapOutput {
	return o
}

func (o DistributionMapOutput) MapIndex(k pulumi.StringInput) DistributionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Distribution {
		return vs[0].(map[string]*Distribution)[vs[1].(string)]
	}).(DistributionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DistributionInput)(nil)).Elem(), &Distribution{})
	pulumi.RegisterInputType(reflect.TypeOf((*DistributionArrayInput)(nil)).Elem(), DistributionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DistributionMapInput)(nil)).Elem(), DistributionMap{})
	pulumi.RegisterOutputType(DistributionOutput{})
	pulumi.RegisterOutputType(DistributionArrayOutput{})
	pulumi.RegisterOutputType(DistributionMapOutput{})
}
