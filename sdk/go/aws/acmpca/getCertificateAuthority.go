// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package acmpca

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information on a AWS Certificate Manager Private Certificate Authority (ACM PCA Certificate Authority).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/acmpca"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := acmpca.LookupCertificateAuthority(ctx, &acmpca.LookupCertificateAuthorityArgs{
// 			Arn: "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupCertificateAuthority(ctx *pulumi.Context, args *LookupCertificateAuthorityArgs, opts ...pulumi.InvokeOption) (*LookupCertificateAuthorityResult, error) {
	var rv LookupCertificateAuthorityResult
	err := ctx.Invoke("aws:acmpca/getCertificateAuthority:getCertificateAuthority", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCertificateAuthority.
type LookupCertificateAuthorityArgs struct {
	// Amazon Resource Name (ARN) of the certificate authority.
	Arn string `pulumi:"arn"`
	// Nested attribute containing revocation configuration.
	// * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
	// * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
	// * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
	// * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
	// * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
	// * `revocation_configuration.0.crl_configuration.0.s3_object_acl` - Whether the CRL is publicly readable or privately held in the CRL Amazon S3 bucket.
	RevocationConfigurations []GetCertificateAuthorityRevocationConfiguration `pulumi:"revocationConfigurations"`
	// Specifies a key-value map of user-defined tags that are attached to the certificate authority.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getCertificateAuthority.
type LookupCertificateAuthorityResult struct {
	Arn string `pulumi:"arn"`
	// Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
	Certificate string `pulumi:"certificate"`
	// Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
	CertificateChain string `pulumi:"certificateChain"`
	// The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
	CertificateSigningRequest string `pulumi:"certificateSigningRequest"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
	NotAfter string `pulumi:"notAfter"`
	// Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
	NotBefore string `pulumi:"notBefore"`
	// Nested attribute containing revocation configuration.
	// * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
	// * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
	// * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
	// * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
	// * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
	// * `revocation_configuration.0.crl_configuration.0.s3_object_acl` - Whether the CRL is publicly readable or privately held in the CRL Amazon S3 bucket.
	RevocationConfigurations []GetCertificateAuthorityRevocationConfiguration `pulumi:"revocationConfigurations"`
	// Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
	Serial string `pulumi:"serial"`
	// Status of the certificate authority.
	Status string `pulumi:"status"`
	// Specifies a key-value map of user-defined tags that are attached to the certificate authority.
	Tags map[string]string `pulumi:"tags"`
	// The type of the certificate authority.
	Type string `pulumi:"type"`
}

func LookupCertificateAuthorityOutput(ctx *pulumi.Context, args LookupCertificateAuthorityOutputArgs, opts ...pulumi.InvokeOption) LookupCertificateAuthorityResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupCertificateAuthorityResult, error) {
			args := v.(LookupCertificateAuthorityArgs)
			r, err := LookupCertificateAuthority(ctx, &args, opts...)
			return *r, err
		}).(LookupCertificateAuthorityResultOutput)
}

// A collection of arguments for invoking getCertificateAuthority.
type LookupCertificateAuthorityOutputArgs struct {
	// Amazon Resource Name (ARN) of the certificate authority.
	Arn pulumi.StringInput `pulumi:"arn"`
	// Nested attribute containing revocation configuration.
	// * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
	// * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
	// * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
	// * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
	// * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
	// * `revocation_configuration.0.crl_configuration.0.s3_object_acl` - Whether the CRL is publicly readable or privately held in the CRL Amazon S3 bucket.
	RevocationConfigurations GetCertificateAuthorityRevocationConfigurationArrayInput `pulumi:"revocationConfigurations"`
	// Specifies a key-value map of user-defined tags that are attached to the certificate authority.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupCertificateAuthorityOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCertificateAuthorityArgs)(nil)).Elem()
}

// A collection of values returned by getCertificateAuthority.
type LookupCertificateAuthorityResultOutput struct{ *pulumi.OutputState }

func (LookupCertificateAuthorityResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupCertificateAuthorityResult)(nil)).Elem()
}

func (o LookupCertificateAuthorityResultOutput) ToLookupCertificateAuthorityResultOutput() LookupCertificateAuthorityResultOutput {
	return o
}

func (o LookupCertificateAuthorityResultOutput) ToLookupCertificateAuthorityResultOutputWithContext(ctx context.Context) LookupCertificateAuthorityResultOutput {
	return o
}

func (o LookupCertificateAuthorityResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateAuthorityResult) string { return v.Arn }).(pulumi.StringOutput)
}

// Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
func (o LookupCertificateAuthorityResultOutput) Certificate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateAuthorityResult) string { return v.Certificate }).(pulumi.StringOutput)
}

// Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
func (o LookupCertificateAuthorityResultOutput) CertificateChain() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateAuthorityResult) string { return v.CertificateChain }).(pulumi.StringOutput)
}

// The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
func (o LookupCertificateAuthorityResultOutput) CertificateSigningRequest() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateAuthorityResult) string { return v.CertificateSigningRequest }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupCertificateAuthorityResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateAuthorityResult) string { return v.Id }).(pulumi.StringOutput)
}

// Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
func (o LookupCertificateAuthorityResultOutput) NotAfter() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateAuthorityResult) string { return v.NotAfter }).(pulumi.StringOutput)
}

// Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
func (o LookupCertificateAuthorityResultOutput) NotBefore() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateAuthorityResult) string { return v.NotBefore }).(pulumi.StringOutput)
}

// Nested attribute containing revocation configuration.
// * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
// * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
// * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
// * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
// * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
// * `revocation_configuration.0.crl_configuration.0.s3_object_acl` - Whether the CRL is publicly readable or privately held in the CRL Amazon S3 bucket.
func (o LookupCertificateAuthorityResultOutput) RevocationConfigurations() GetCertificateAuthorityRevocationConfigurationArrayOutput {
	return o.ApplyT(func(v LookupCertificateAuthorityResult) []GetCertificateAuthorityRevocationConfiguration {
		return v.RevocationConfigurations
	}).(GetCertificateAuthorityRevocationConfigurationArrayOutput)
}

// Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
func (o LookupCertificateAuthorityResultOutput) Serial() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateAuthorityResult) string { return v.Serial }).(pulumi.StringOutput)
}

// Status of the certificate authority.
func (o LookupCertificateAuthorityResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateAuthorityResult) string { return v.Status }).(pulumi.StringOutput)
}

// Specifies a key-value map of user-defined tags that are attached to the certificate authority.
func (o LookupCertificateAuthorityResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupCertificateAuthorityResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// The type of the certificate authority.
func (o LookupCertificateAuthorityResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupCertificateAuthorityResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupCertificateAuthorityResultOutput{})
}
