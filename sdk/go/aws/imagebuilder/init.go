// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package imagebuilder

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "aws:imagebuilder/component:Component":
		r = &Component{}
	case "aws:imagebuilder/containerRecipe:ContainerRecipe":
		r = &ContainerRecipe{}
	case "aws:imagebuilder/distributionConfiguration:DistributionConfiguration":
		r = &DistributionConfiguration{}
	case "aws:imagebuilder/image:Image":
		r = &Image{}
	case "aws:imagebuilder/imagePipeline:ImagePipeline":
		r = &ImagePipeline{}
	case "aws:imagebuilder/imageRecipe:ImageRecipe":
		r = &ImageRecipe{}
	case "aws:imagebuilder/infrastructureConfiguration:InfrastructureConfiguration":
		r = &InfrastructureConfiguration{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

func init() {
	version, err := aws.PkgVersion()
	if err != nil {
		fmt.Printf("failed to determine package version. defaulting to v1: %v\n", err)
	}
	pulumi.RegisterResourceModule(
		"aws",
		"imagebuilder/component",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"imagebuilder/containerRecipe",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"imagebuilder/distributionConfiguration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"imagebuilder/image",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"imagebuilder/imagePipeline",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"imagebuilder/imageRecipe",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"imagebuilder/infrastructureConfiguration",
		&module{version},
	)
}
