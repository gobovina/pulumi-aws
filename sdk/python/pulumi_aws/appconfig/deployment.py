# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DeploymentArgs', 'Deployment']

@pulumi.input_type
class DeploymentArgs:
    def __init__(__self__, *,
                 application_id: pulumi.Input[str],
                 configuration_profile_id: pulumi.Input[str],
                 configuration_version: pulumi.Input[str],
                 deployment_strategy_id: pulumi.Input[str],
                 environment_id: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 kms_key_identifier: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Deployment resource.
        :param pulumi.Input[str] application_id: Application ID. Must be between 4 and 7 characters in length.
        :param pulumi.Input[str] configuration_profile_id: Configuration profile ID. Must be between 4 and 7 characters in length.
        :param pulumi.Input[str] configuration_version: Configuration version to deploy. Can be at most 1024 characters.
        :param pulumi.Input[str] deployment_strategy_id: Deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
        :param pulumi.Input[str] environment_id: Environment ID. Must be between 4 and 7 characters in length.
        :param pulumi.Input[str] description: Description of the deployment. Can be at most 1024 characters.
        :param pulumi.Input[str] kms_key_identifier: The KMS key identifier (key ID, key alias, or key ARN). AppConfig uses this to encrypt the configuration data using a customer managed key.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "application_id", application_id)
        pulumi.set(__self__, "configuration_profile_id", configuration_profile_id)
        pulumi.set(__self__, "configuration_version", configuration_version)
        pulumi.set(__self__, "deployment_strategy_id", deployment_strategy_id)
        pulumi.set(__self__, "environment_id", environment_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if kms_key_identifier is not None:
            pulumi.set(__self__, "kms_key_identifier", kms_key_identifier)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> pulumi.Input[str]:
        """
        Application ID. Must be between 4 and 7 characters in length.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter(name="configurationProfileId")
    def configuration_profile_id(self) -> pulumi.Input[str]:
        """
        Configuration profile ID. Must be between 4 and 7 characters in length.
        """
        return pulumi.get(self, "configuration_profile_id")

    @configuration_profile_id.setter
    def configuration_profile_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "configuration_profile_id", value)

    @property
    @pulumi.getter(name="configurationVersion")
    def configuration_version(self) -> pulumi.Input[str]:
        """
        Configuration version to deploy. Can be at most 1024 characters.
        """
        return pulumi.get(self, "configuration_version")

    @configuration_version.setter
    def configuration_version(self, value: pulumi.Input[str]):
        pulumi.set(self, "configuration_version", value)

    @property
    @pulumi.getter(name="deploymentStrategyId")
    def deployment_strategy_id(self) -> pulumi.Input[str]:
        """
        Deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
        """
        return pulumi.get(self, "deployment_strategy_id")

    @deployment_strategy_id.setter
    def deployment_strategy_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "deployment_strategy_id", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Input[str]:
        """
        Environment ID. Must be between 4 and 7 characters in length.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the deployment. Can be at most 1024 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="kmsKeyIdentifier")
    def kms_key_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        The KMS key identifier (key ID, key alias, or key ARN). AppConfig uses this to encrypt the configuration data using a customer managed key.
        """
        return pulumi.get(self, "kms_key_identifier")

    @kms_key_identifier.setter
    def kms_key_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_identifier", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _DeploymentState:
    def __init__(__self__, *,
                 application_id: Optional[pulumi.Input[str]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 configuration_profile_id: Optional[pulumi.Input[str]] = None,
                 configuration_version: Optional[pulumi.Input[str]] = None,
                 deployment_number: Optional[pulumi.Input[int]] = None,
                 deployment_strategy_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 kms_key_arn: Optional[pulumi.Input[str]] = None,
                 kms_key_identifier: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Deployment resources.
        :param pulumi.Input[str] application_id: Application ID. Must be between 4 and 7 characters in length.
        :param pulumi.Input[str] arn: ARN of the AppConfig Deployment.
        :param pulumi.Input[str] configuration_profile_id: Configuration profile ID. Must be between 4 and 7 characters in length.
        :param pulumi.Input[str] configuration_version: Configuration version to deploy. Can be at most 1024 characters.
        :param pulumi.Input[int] deployment_number: Deployment number.
        :param pulumi.Input[str] deployment_strategy_id: Deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
        :param pulumi.Input[str] description: Description of the deployment. Can be at most 1024 characters.
        :param pulumi.Input[str] environment_id: Environment ID. Must be between 4 and 7 characters in length.
        :param pulumi.Input[str] kms_key_arn: ARN of the KMS key used to encrypt configuration data.
        :param pulumi.Input[str] kms_key_identifier: The KMS key identifier (key ID, key alias, or key ARN). AppConfig uses this to encrypt the configuration data using a customer managed key.
        :param pulumi.Input[str] state: State of the deployment.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if application_id is not None:
            pulumi.set(__self__, "application_id", application_id)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if configuration_profile_id is not None:
            pulumi.set(__self__, "configuration_profile_id", configuration_profile_id)
        if configuration_version is not None:
            pulumi.set(__self__, "configuration_version", configuration_version)
        if deployment_number is not None:
            pulumi.set(__self__, "deployment_number", deployment_number)
        if deployment_strategy_id is not None:
            pulumi.set(__self__, "deployment_strategy_id", deployment_strategy_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if environment_id is not None:
            pulumi.set(__self__, "environment_id", environment_id)
        if kms_key_arn is not None:
            pulumi.set(__self__, "kms_key_arn", kms_key_arn)
        if kms_key_identifier is not None:
            pulumi.set(__self__, "kms_key_identifier", kms_key_identifier)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> Optional[pulumi.Input[str]]:
        """
        Application ID. Must be between 4 and 7 characters in length.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the AppConfig Deployment.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="configurationProfileId")
    def configuration_profile_id(self) -> Optional[pulumi.Input[str]]:
        """
        Configuration profile ID. Must be between 4 and 7 characters in length.
        """
        return pulumi.get(self, "configuration_profile_id")

    @configuration_profile_id.setter
    def configuration_profile_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "configuration_profile_id", value)

    @property
    @pulumi.getter(name="configurationVersion")
    def configuration_version(self) -> Optional[pulumi.Input[str]]:
        """
        Configuration version to deploy. Can be at most 1024 characters.
        """
        return pulumi.get(self, "configuration_version")

    @configuration_version.setter
    def configuration_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "configuration_version", value)

    @property
    @pulumi.getter(name="deploymentNumber")
    def deployment_number(self) -> Optional[pulumi.Input[int]]:
        """
        Deployment number.
        """
        return pulumi.get(self, "deployment_number")

    @deployment_number.setter
    def deployment_number(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "deployment_number", value)

    @property
    @pulumi.getter(name="deploymentStrategyId")
    def deployment_strategy_id(self) -> Optional[pulumi.Input[str]]:
        """
        Deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
        """
        return pulumi.get(self, "deployment_strategy_id")

    @deployment_strategy_id.setter
    def deployment_strategy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "deployment_strategy_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the deployment. Can be at most 1024 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> Optional[pulumi.Input[str]]:
        """
        Environment ID. Must be between 4 and 7 characters in length.
        """
        return pulumi.get(self, "environment_id")

    @environment_id.setter
    def environment_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "environment_id", value)

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the KMS key used to encrypt configuration data.
        """
        return pulumi.get(self, "kms_key_arn")

    @kms_key_arn.setter
    def kms_key_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_arn", value)

    @property
    @pulumi.getter(name="kmsKeyIdentifier")
    def kms_key_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        The KMS key identifier (key ID, key alias, or key ARN). AppConfig uses this to encrypt the configuration data using a customer managed key.
        """
        return pulumi.get(self, "kms_key_identifier")

    @kms_key_identifier.setter
    def kms_key_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_identifier", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        State of the deployment.
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class Deployment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 configuration_profile_id: Optional[pulumi.Input[str]] = None,
                 configuration_version: Optional[pulumi.Input[str]] = None,
                 deployment_strategy_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 kms_key_identifier: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides an AppConfig Deployment resource for an `appconfig.Application` resource.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.appconfig.Deployment("example",
            application_id=example_aws_appconfig_application["id"],
            configuration_profile_id=example_aws_appconfig_configuration_profile["configurationProfileId"],
            configuration_version=example_aws_appconfig_hosted_configuration_version["versionNumber"],
            deployment_strategy_id=example_aws_appconfig_deployment_strategy["id"],
            description="My example deployment",
            environment_id=example_aws_appconfig_environment["environmentId"],
            kms_key_identifier=example_aws_kms_key["arn"],
            tags={
                "Type": "AppConfig Deployment",
            })
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import AppConfig Deployments using the application ID, environment ID, and deployment number separated by a slash (`/`). For example:

        ```sh
        $ pulumi import aws:appconfig/deployment:Deployment example 71abcde/11xxxxx/1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_id: Application ID. Must be between 4 and 7 characters in length.
        :param pulumi.Input[str] configuration_profile_id: Configuration profile ID. Must be between 4 and 7 characters in length.
        :param pulumi.Input[str] configuration_version: Configuration version to deploy. Can be at most 1024 characters.
        :param pulumi.Input[str] deployment_strategy_id: Deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
        :param pulumi.Input[str] description: Description of the deployment. Can be at most 1024 characters.
        :param pulumi.Input[str] environment_id: Environment ID. Must be between 4 and 7 characters in length.
        :param pulumi.Input[str] kms_key_identifier: The KMS key identifier (key ID, key alias, or key ARN). AppConfig uses this to encrypt the configuration data using a customer managed key.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DeploymentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an AppConfig Deployment resource for an `appconfig.Application` resource.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.appconfig.Deployment("example",
            application_id=example_aws_appconfig_application["id"],
            configuration_profile_id=example_aws_appconfig_configuration_profile["configurationProfileId"],
            configuration_version=example_aws_appconfig_hosted_configuration_version["versionNumber"],
            deployment_strategy_id=example_aws_appconfig_deployment_strategy["id"],
            description="My example deployment",
            environment_id=example_aws_appconfig_environment["environmentId"],
            kms_key_identifier=example_aws_kms_key["arn"],
            tags={
                "Type": "AppConfig Deployment",
            })
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import AppConfig Deployments using the application ID, environment ID, and deployment number separated by a slash (`/`). For example:

        ```sh
        $ pulumi import aws:appconfig/deployment:Deployment example 71abcde/11xxxxx/1
        ```

        :param str resource_name: The name of the resource.
        :param DeploymentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DeploymentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 configuration_profile_id: Optional[pulumi.Input[str]] = None,
                 configuration_version: Optional[pulumi.Input[str]] = None,
                 deployment_strategy_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 environment_id: Optional[pulumi.Input[str]] = None,
                 kms_key_identifier: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DeploymentArgs.__new__(DeploymentArgs)

            if application_id is None and not opts.urn:
                raise TypeError("Missing required property 'application_id'")
            __props__.__dict__["application_id"] = application_id
            if configuration_profile_id is None and not opts.urn:
                raise TypeError("Missing required property 'configuration_profile_id'")
            __props__.__dict__["configuration_profile_id"] = configuration_profile_id
            if configuration_version is None and not opts.urn:
                raise TypeError("Missing required property 'configuration_version'")
            __props__.__dict__["configuration_version"] = configuration_version
            if deployment_strategy_id is None and not opts.urn:
                raise TypeError("Missing required property 'deployment_strategy_id'")
            __props__.__dict__["deployment_strategy_id"] = deployment_strategy_id
            __props__.__dict__["description"] = description
            if environment_id is None and not opts.urn:
                raise TypeError("Missing required property 'environment_id'")
            __props__.__dict__["environment_id"] = environment_id
            __props__.__dict__["kms_key_identifier"] = kms_key_identifier
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["deployment_number"] = None
            __props__.__dict__["kms_key_arn"] = None
            __props__.__dict__["state"] = None
            __props__.__dict__["tags_all"] = None
        super(Deployment, __self__).__init__(
            'aws:appconfig/deployment:Deployment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            application_id: Optional[pulumi.Input[str]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            configuration_profile_id: Optional[pulumi.Input[str]] = None,
            configuration_version: Optional[pulumi.Input[str]] = None,
            deployment_number: Optional[pulumi.Input[int]] = None,
            deployment_strategy_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            environment_id: Optional[pulumi.Input[str]] = None,
            kms_key_arn: Optional[pulumi.Input[str]] = None,
            kms_key_identifier: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Deployment':
        """
        Get an existing Deployment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_id: Application ID. Must be between 4 and 7 characters in length.
        :param pulumi.Input[str] arn: ARN of the AppConfig Deployment.
        :param pulumi.Input[str] configuration_profile_id: Configuration profile ID. Must be between 4 and 7 characters in length.
        :param pulumi.Input[str] configuration_version: Configuration version to deploy. Can be at most 1024 characters.
        :param pulumi.Input[int] deployment_number: Deployment number.
        :param pulumi.Input[str] deployment_strategy_id: Deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
        :param pulumi.Input[str] description: Description of the deployment. Can be at most 1024 characters.
        :param pulumi.Input[str] environment_id: Environment ID. Must be between 4 and 7 characters in length.
        :param pulumi.Input[str] kms_key_arn: ARN of the KMS key used to encrypt configuration data.
        :param pulumi.Input[str] kms_key_identifier: The KMS key identifier (key ID, key alias, or key ARN). AppConfig uses this to encrypt the configuration data using a customer managed key.
        :param pulumi.Input[str] state: State of the deployment.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DeploymentState.__new__(_DeploymentState)

        __props__.__dict__["application_id"] = application_id
        __props__.__dict__["arn"] = arn
        __props__.__dict__["configuration_profile_id"] = configuration_profile_id
        __props__.__dict__["configuration_version"] = configuration_version
        __props__.__dict__["deployment_number"] = deployment_number
        __props__.__dict__["deployment_strategy_id"] = deployment_strategy_id
        __props__.__dict__["description"] = description
        __props__.__dict__["environment_id"] = environment_id
        __props__.__dict__["kms_key_arn"] = kms_key_arn
        __props__.__dict__["kms_key_identifier"] = kms_key_identifier
        __props__.__dict__["state"] = state
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Deployment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> pulumi.Output[str]:
        """
        Application ID. Must be between 4 and 7 characters in length.
        """
        return pulumi.get(self, "application_id")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the AppConfig Deployment.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="configurationProfileId")
    def configuration_profile_id(self) -> pulumi.Output[str]:
        """
        Configuration profile ID. Must be between 4 and 7 characters in length.
        """
        return pulumi.get(self, "configuration_profile_id")

    @property
    @pulumi.getter(name="configurationVersion")
    def configuration_version(self) -> pulumi.Output[str]:
        """
        Configuration version to deploy. Can be at most 1024 characters.
        """
        return pulumi.get(self, "configuration_version")

    @property
    @pulumi.getter(name="deploymentNumber")
    def deployment_number(self) -> pulumi.Output[int]:
        """
        Deployment number.
        """
        return pulumi.get(self, "deployment_number")

    @property
    @pulumi.getter(name="deploymentStrategyId")
    def deployment_strategy_id(self) -> pulumi.Output[str]:
        """
        Deployment strategy ID or name of a predefined deployment strategy. See [Predefined Deployment Strategies](https://docs.aws.amazon.com/appconfig/latest/userguide/appconfig-creating-deployment-strategy.html#appconfig-creating-deployment-strategy-predefined) for more details.
        """
        return pulumi.get(self, "deployment_strategy_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the deployment. Can be at most 1024 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="environmentId")
    def environment_id(self) -> pulumi.Output[str]:
        """
        Environment ID. Must be between 4 and 7 characters in length.
        """
        return pulumi.get(self, "environment_id")

    @property
    @pulumi.getter(name="kmsKeyArn")
    def kms_key_arn(self) -> pulumi.Output[str]:
        """
        ARN of the KMS key used to encrypt configuration data.
        """
        return pulumi.get(self, "kms_key_arn")

    @property
    @pulumi.getter(name="kmsKeyIdentifier")
    def kms_key_identifier(self) -> pulumi.Output[Optional[str]]:
        """
        The KMS key identifier (key ID, key alias, or key ARN). AppConfig uses this to encrypt the configuration data using a customer managed key.
        """
        return pulumi.get(self, "kms_key_identifier")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        State of the deployment.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

