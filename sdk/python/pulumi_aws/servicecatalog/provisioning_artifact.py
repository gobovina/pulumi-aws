# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ProvisioningArtifactArgs', 'ProvisioningArtifact']

@pulumi.input_type
class ProvisioningArtifactArgs:
    def __init__(__self__, *,
                 product_id: pulumi.Input[str],
                 accept_language: Optional[pulumi.Input[str]] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disable_template_validation: Optional[pulumi.Input[bool]] = None,
                 guidance: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 template_physical_id: Optional[pulumi.Input[str]] = None,
                 template_url: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ProvisioningArtifact resource.
        :param pulumi.Input[str] product_id: Identifier of the product.
        :param pulumi.Input[str] accept_language: Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
        :param pulumi.Input[bool] active: Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
        :param pulumi.Input[str] description: Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
        :param pulumi.Input[bool] disable_template_validation: Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
        :param pulumi.Input[str] guidance: Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
        :param pulumi.Input[str] name: Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
        :param pulumi.Input[str] template_physical_id: Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
        :param pulumi.Input[str] template_url: Template source as URL of the CloudFormation template in Amazon S3.
               
               The following arguments are optional:
        :param pulumi.Input[str] type: Type of provisioning artifact. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ProvisioningArtifactProperties.html) for valid list of values.
        """
        pulumi.set(__self__, "product_id", product_id)
        if accept_language is not None:
            pulumi.set(__self__, "accept_language", accept_language)
        if active is not None:
            pulumi.set(__self__, "active", active)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disable_template_validation is not None:
            pulumi.set(__self__, "disable_template_validation", disable_template_validation)
        if guidance is not None:
            pulumi.set(__self__, "guidance", guidance)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if template_physical_id is not None:
            pulumi.set(__self__, "template_physical_id", template_physical_id)
        if template_url is not None:
            pulumi.set(__self__, "template_url", template_url)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="productId")
    def product_id(self) -> pulumi.Input[str]:
        """
        Identifier of the product.
        """
        return pulumi.get(self, "product_id")

    @product_id.setter
    def product_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "product_id", value)

    @property
    @pulumi.getter(name="acceptLanguage")
    def accept_language(self) -> Optional[pulumi.Input[str]]:
        """
        Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
        """
        return pulumi.get(self, "accept_language")

    @accept_language.setter
    def accept_language(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "accept_language", value)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="disableTemplateValidation")
    def disable_template_validation(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
        """
        return pulumi.get(self, "disable_template_validation")

    @disable_template_validation.setter
    def disable_template_validation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable_template_validation", value)

    @property
    @pulumi.getter
    def guidance(self) -> Optional[pulumi.Input[str]]:
        """
        Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
        """
        return pulumi.get(self, "guidance")

    @guidance.setter
    def guidance(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "guidance", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="templatePhysicalId")
    def template_physical_id(self) -> Optional[pulumi.Input[str]]:
        """
        Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
        """
        return pulumi.get(self, "template_physical_id")

    @template_physical_id.setter
    def template_physical_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "template_physical_id", value)

    @property
    @pulumi.getter(name="templateUrl")
    def template_url(self) -> Optional[pulumi.Input[str]]:
        """
        Template source as URL of the CloudFormation template in Amazon S3.

        The following arguments are optional:
        """
        return pulumi.get(self, "template_url")

    @template_url.setter
    def template_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "template_url", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of provisioning artifact. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ProvisioningArtifactProperties.html) for valid list of values.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _ProvisioningArtifactState:
    def __init__(__self__, *,
                 accept_language: Optional[pulumi.Input[str]] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 created_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disable_template_validation: Optional[pulumi.Input[bool]] = None,
                 guidance: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 product_id: Optional[pulumi.Input[str]] = None,
                 provisioning_artifact_id: Optional[pulumi.Input[str]] = None,
                 template_physical_id: Optional[pulumi.Input[str]] = None,
                 template_url: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ProvisioningArtifact resources.
        :param pulumi.Input[str] accept_language: Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
        :param pulumi.Input[bool] active: Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
        :param pulumi.Input[str] created_time: Time when the provisioning artifact was created.
        :param pulumi.Input[str] description: Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
        :param pulumi.Input[bool] disable_template_validation: Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
        :param pulumi.Input[str] guidance: Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
        :param pulumi.Input[str] name: Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
        :param pulumi.Input[str] product_id: Identifier of the product.
        :param pulumi.Input[str] provisioning_artifact_id: Provisioning artifact identifier.
        :param pulumi.Input[str] template_physical_id: Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
        :param pulumi.Input[str] template_url: Template source as URL of the CloudFormation template in Amazon S3.
               
               The following arguments are optional:
        :param pulumi.Input[str] type: Type of provisioning artifact. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ProvisioningArtifactProperties.html) for valid list of values.
        """
        if accept_language is not None:
            pulumi.set(__self__, "accept_language", accept_language)
        if active is not None:
            pulumi.set(__self__, "active", active)
        if created_time is not None:
            pulumi.set(__self__, "created_time", created_time)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disable_template_validation is not None:
            pulumi.set(__self__, "disable_template_validation", disable_template_validation)
        if guidance is not None:
            pulumi.set(__self__, "guidance", guidance)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if product_id is not None:
            pulumi.set(__self__, "product_id", product_id)
        if provisioning_artifact_id is not None:
            pulumi.set(__self__, "provisioning_artifact_id", provisioning_artifact_id)
        if template_physical_id is not None:
            pulumi.set(__self__, "template_physical_id", template_physical_id)
        if template_url is not None:
            pulumi.set(__self__, "template_url", template_url)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="acceptLanguage")
    def accept_language(self) -> Optional[pulumi.Input[str]]:
        """
        Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
        """
        return pulumi.get(self, "accept_language")

    @accept_language.setter
    def accept_language(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "accept_language", value)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter(name="createdTime")
    def created_time(self) -> Optional[pulumi.Input[str]]:
        """
        Time when the provisioning artifact was created.
        """
        return pulumi.get(self, "created_time")

    @created_time.setter
    def created_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="disableTemplateValidation")
    def disable_template_validation(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
        """
        return pulumi.get(self, "disable_template_validation")

    @disable_template_validation.setter
    def disable_template_validation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable_template_validation", value)

    @property
    @pulumi.getter
    def guidance(self) -> Optional[pulumi.Input[str]]:
        """
        Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
        """
        return pulumi.get(self, "guidance")

    @guidance.setter
    def guidance(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "guidance", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="productId")
    def product_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the product.
        """
        return pulumi.get(self, "product_id")

    @product_id.setter
    def product_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "product_id", value)

    @property
    @pulumi.getter(name="provisioningArtifactId")
    def provisioning_artifact_id(self) -> Optional[pulumi.Input[str]]:
        """
        Provisioning artifact identifier.
        """
        return pulumi.get(self, "provisioning_artifact_id")

    @provisioning_artifact_id.setter
    def provisioning_artifact_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "provisioning_artifact_id", value)

    @property
    @pulumi.getter(name="templatePhysicalId")
    def template_physical_id(self) -> Optional[pulumi.Input[str]]:
        """
        Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
        """
        return pulumi.get(self, "template_physical_id")

    @template_physical_id.setter
    def template_physical_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "template_physical_id", value)

    @property
    @pulumi.getter(name="templateUrl")
    def template_url(self) -> Optional[pulumi.Input[str]]:
        """
        Template source as URL of the CloudFormation template in Amazon S3.

        The following arguments are optional:
        """
        return pulumi.get(self, "template_url")

    @template_url.setter
    def template_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "template_url", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of provisioning artifact. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ProvisioningArtifactProperties.html) for valid list of values.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class ProvisioningArtifact(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accept_language: Optional[pulumi.Input[str]] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disable_template_validation: Optional[pulumi.Input[bool]] = None,
                 guidance: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 product_id: Optional[pulumi.Input[str]] = None,
                 template_physical_id: Optional[pulumi.Input[str]] = None,
                 template_url: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Service Catalog Provisioning Artifact for a specified product.

        > A "provisioning artifact" is also referred to as a "version."

        > **NOTE:** You cannot create a provisioning artifact for a product that was shared with you.

        > **NOTE:** The user or role that use this resource must have the `cloudformation:GetTemplate` IAM policy permission. This policy permission is required when using the `template_physical_id` argument.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.servicecatalog.ProvisioningArtifact("example",
            name="example",
            product_id=example_aws_servicecatalog_product["id"],
            type="CLOUD_FORMATION_TEMPLATE",
            template_url=f"https://{example_aws_s3_bucket['bucketRegionalDomainName']}/{example_aws_s3_object['key']}")
        ```

        ## Import

        Using `pulumi import`, import `aws_servicecatalog_provisioning_artifact` using the provisioning artifact ID and product ID separated by a colon. For example:

        ```sh
         $ pulumi import aws:servicecatalog/provisioningArtifact:ProvisioningArtifact example pa-ij2b6lusy6dec:prod-el3an0rma3
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accept_language: Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
        :param pulumi.Input[bool] active: Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
        :param pulumi.Input[str] description: Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
        :param pulumi.Input[bool] disable_template_validation: Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
        :param pulumi.Input[str] guidance: Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
        :param pulumi.Input[str] name: Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
        :param pulumi.Input[str] product_id: Identifier of the product.
        :param pulumi.Input[str] template_physical_id: Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
        :param pulumi.Input[str] template_url: Template source as URL of the CloudFormation template in Amazon S3.
               
               The following arguments are optional:
        :param pulumi.Input[str] type: Type of provisioning artifact. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ProvisioningArtifactProperties.html) for valid list of values.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProvisioningArtifactArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Service Catalog Provisioning Artifact for a specified product.

        > A "provisioning artifact" is also referred to as a "version."

        > **NOTE:** You cannot create a provisioning artifact for a product that was shared with you.

        > **NOTE:** The user or role that use this resource must have the `cloudformation:GetTemplate` IAM policy permission. This policy permission is required when using the `template_physical_id` argument.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.servicecatalog.ProvisioningArtifact("example",
            name="example",
            product_id=example_aws_servicecatalog_product["id"],
            type="CLOUD_FORMATION_TEMPLATE",
            template_url=f"https://{example_aws_s3_bucket['bucketRegionalDomainName']}/{example_aws_s3_object['key']}")
        ```

        ## Import

        Using `pulumi import`, import `aws_servicecatalog_provisioning_artifact` using the provisioning artifact ID and product ID separated by a colon. For example:

        ```sh
         $ pulumi import aws:servicecatalog/provisioningArtifact:ProvisioningArtifact example pa-ij2b6lusy6dec:prod-el3an0rma3
        ```

        :param str resource_name: The name of the resource.
        :param ProvisioningArtifactArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProvisioningArtifactArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 accept_language: Optional[pulumi.Input[str]] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disable_template_validation: Optional[pulumi.Input[bool]] = None,
                 guidance: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 product_id: Optional[pulumi.Input[str]] = None,
                 template_physical_id: Optional[pulumi.Input[str]] = None,
                 template_url: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProvisioningArtifactArgs.__new__(ProvisioningArtifactArgs)

            __props__.__dict__["accept_language"] = accept_language
            __props__.__dict__["active"] = active
            __props__.__dict__["description"] = description
            __props__.__dict__["disable_template_validation"] = disable_template_validation
            __props__.__dict__["guidance"] = guidance
            __props__.__dict__["name"] = name
            if product_id is None and not opts.urn:
                raise TypeError("Missing required property 'product_id'")
            __props__.__dict__["product_id"] = product_id
            __props__.__dict__["template_physical_id"] = template_physical_id
            __props__.__dict__["template_url"] = template_url
            __props__.__dict__["type"] = type
            __props__.__dict__["created_time"] = None
            __props__.__dict__["provisioning_artifact_id"] = None
        super(ProvisioningArtifact, __self__).__init__(
            'aws:servicecatalog/provisioningArtifact:ProvisioningArtifact',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            accept_language: Optional[pulumi.Input[str]] = None,
            active: Optional[pulumi.Input[bool]] = None,
            created_time: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            disable_template_validation: Optional[pulumi.Input[bool]] = None,
            guidance: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            product_id: Optional[pulumi.Input[str]] = None,
            provisioning_artifact_id: Optional[pulumi.Input[str]] = None,
            template_physical_id: Optional[pulumi.Input[str]] = None,
            template_url: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'ProvisioningArtifact':
        """
        Get an existing ProvisioningArtifact resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] accept_language: Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
        :param pulumi.Input[bool] active: Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
        :param pulumi.Input[str] created_time: Time when the provisioning artifact was created.
        :param pulumi.Input[str] description: Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
        :param pulumi.Input[bool] disable_template_validation: Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
        :param pulumi.Input[str] guidance: Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
        :param pulumi.Input[str] name: Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
        :param pulumi.Input[str] product_id: Identifier of the product.
        :param pulumi.Input[str] provisioning_artifact_id: Provisioning artifact identifier.
        :param pulumi.Input[str] template_physical_id: Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
        :param pulumi.Input[str] template_url: Template source as URL of the CloudFormation template in Amazon S3.
               
               The following arguments are optional:
        :param pulumi.Input[str] type: Type of provisioning artifact. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ProvisioningArtifactProperties.html) for valid list of values.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProvisioningArtifactState.__new__(_ProvisioningArtifactState)

        __props__.__dict__["accept_language"] = accept_language
        __props__.__dict__["active"] = active
        __props__.__dict__["created_time"] = created_time
        __props__.__dict__["description"] = description
        __props__.__dict__["disable_template_validation"] = disable_template_validation
        __props__.__dict__["guidance"] = guidance
        __props__.__dict__["name"] = name
        __props__.__dict__["product_id"] = product_id
        __props__.__dict__["provisioning_artifact_id"] = provisioning_artifact_id
        __props__.__dict__["template_physical_id"] = template_physical_id
        __props__.__dict__["template_url"] = template_url
        __props__.__dict__["type"] = type
        return ProvisioningArtifact(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="acceptLanguage")
    def accept_language(self) -> pulumi.Output[Optional[str]]:
        """
        Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). The default value is `en`.
        """
        return pulumi.get(self, "accept_language")

    @property
    @pulumi.getter
    def active(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact. Default is `true`.
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter(name="createdTime")
    def created_time(self) -> pulumi.Output[str]:
        """
        Time when the provisioning artifact was created.
        """
        return pulumi.get(self, "created_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description of the provisioning artifact (i.e., version), including how it differs from the previous provisioning artifact.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="disableTemplateValidation")
    def disable_template_validation(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether AWS Service Catalog stops validating the specified provisioning artifact template even if it is invalid.
        """
        return pulumi.get(self, "disable_template_validation")

    @property
    @pulumi.getter
    def guidance(self) -> pulumi.Output[Optional[str]]:
        """
        Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. Valid values are `DEFAULT` and `DEPRECATED`. The default is `DEFAULT`. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
        """
        return pulumi.get(self, "guidance")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the provisioning artifact (for example, `v1`, `v2beta`). No spaces are allowed.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="productId")
    def product_id(self) -> pulumi.Output[str]:
        """
        Identifier of the product.
        """
        return pulumi.get(self, "product_id")

    @property
    @pulumi.getter(name="provisioningArtifactId")
    def provisioning_artifact_id(self) -> pulumi.Output[str]:
        """
        Provisioning artifact identifier.
        """
        return pulumi.get(self, "provisioning_artifact_id")

    @property
    @pulumi.getter(name="templatePhysicalId")
    def template_physical_id(self) -> pulumi.Output[Optional[str]]:
        """
        Template source as the physical ID of the resource that contains the template. Currently only supports CloudFormation stack ARN. Specify the physical ID as `arn:[partition]:cloudformation:[region]:[account ID]:stack/[stack name]/[resource ID]`.
        """
        return pulumi.get(self, "template_physical_id")

    @property
    @pulumi.getter(name="templateUrl")
    def template_url(self) -> pulumi.Output[Optional[str]]:
        """
        Template source as URL of the CloudFormation template in Amazon S3.

        The following arguments are optional:
        """
        return pulumi.get(self, "template_url")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        Type of provisioning artifact. See [AWS Docs](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ProvisioningArtifactProperties.html) for valid list of values.
        """
        return pulumi.get(self, "type")

